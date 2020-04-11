package com.followers.toplibrary.http;


import com.followers.toplibrary.util.FileUtils;
import com.followers.toplibrary.util.Utils;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import mobile.Mobile;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * Created by meng on 2017/10/10.
 */

public class RetrofitServiceManager {

    private static final int DEFAULT_TIME_OUT = 5;//超时时间5秒

    private static final int DEFAULT_READ_TIME_OUT = 10;//读写的超时时间

    private static RetrofitServiceManager instance = null;

    private Retrofit mRetrofit;

    public RetrofitServiceManager() {

        //创建OkhttpClient

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

            builder.connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS);//链接超时时间

            builder.writeTimeout(DEFAULT_READ_TIME_OUT,TimeUnit.SECONDS);//写操作超时时间

            builder.readTimeout(DEFAULT_READ_TIME_OUT,TimeUnit.SECONDS);//读操作超时时间

        String cacheFile;

        //是否有sd卡 缓存路径
        if(FileUtils.hasSDCard()){
            cacheFile= Utils.getContext().getExternalCacheDir().getPath();
        }else{
            cacheFile=Utils.getContext().getCacheDir().getPath();
        }


        //缓存文件为100MB
        Cache cache = new Cache(new File(cacheFile, "HttpCache"), 1024 * 1024 * 100);

        //添加公共参数拦截器

             HttpCommonInterceptor httpCommonInterceptor = new HttpCommonInterceptor.Builder()
                     .addHeaderParams("Content-Type: application/json","Accept: application/json")
                     .builder();

            builder.addInterceptor(httpCommonInterceptor).cache(cache);

            //创建一个Retrofit

           mRetrofit = new Retrofit.Builder()
                   .client(builder.build())
                   .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                   .addConverterFactory(LenientGsonConverterFactory.create(new Gson()))
                   .baseUrl(Utils.getBaseUrl())
                   .build();

    }

    /**
     * 获取RetrofitServiceManager
     * @return
     */

    public static  RetrofitServiceManager getInstance(){

        synchronized (RetrofitServiceManager.class){

            instance = new RetrofitServiceManager();
        }
        return instance;

    }

    /**
     *
     * 获取对应的service
     * @param service
     * @param <T>
     * @return
     */

    public <T> T create(Class<T> service){

        return mRetrofit.create(service);
    }

    public static Interceptor responseInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            //这里对你自己的Response进行处理后重新返回一个Response
            Response responseNew = filterResponse(request, chain);
            return responseNew;
        }
    };

    private static Response filterResponse(Request request, Interceptor.Chain chain) {
        try {
            Response response = chain.proceed(request);
            ResponseBody responseBody = response.peekBody(1024 * 1024);
            String result = responseBody.string();
            result = Mobile.decrypt(result);
            Response.Builder newResponse = new Response.Builder()
                    .request(request)
                    .protocol(response.protocol())
                    .code(response.code())
                    .body(ResponseBody.create(responseBody.contentType(), result));
            Response resp = newResponse.build();
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
