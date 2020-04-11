package com.followers.toplibrary.http;

import com.followers.toplibrary.http.service.HttpService;
import com.followers.toplibrary.util.Utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class RetrofitUtils {

    private final OkHttpClient okHttpClient;
    private final HttpService apiService;

    private RetrofitUtils() {
        //配置此客户端 以便在遇见连接问题时重试或不重试 默认情况下
//该客户端从以下问题中悄悄恢复
        okHttpClient = new OkHttpClient.Builder()
                .readTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                //配置此客户端 以便在遇见连接问题时重试或不重试 默认情况下
                //该客户端从以下问题中悄悄恢复
                .retryOnConnectionFailure(true)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                //集合Gson解析
                .addConverterFactory(GsonConverterFactory.create())
                //集合RxJava
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(Utils.getBaseUrl())
                .client(okHttpClient)
                .build();
        apiService = retrofit.create(HttpService.class);
    }

    public static RetrofitUtils getInstance() {
        return RetroHolder.retro;
    }

    private static class RetroHolder {
        private static final RetrofitUtils retro = new RetrofitUtils();
    }

    public RetrofitUtils upLoadImage(MultipartBody.Part body) {
        apiService.upLoadImage(body).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
        return RetrofitUtils.getInstance();
    }

    private Observer observer = new Observer<ResponseBody>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            if (httpListener != null) {
                httpListener.onError(e.getMessage());
            }
        }

        @Override
        public void onNext(ResponseBody responseBody) {
            if (httpListener != null) {
                try {
                    httpListener.onSuccess(responseBody.string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public interface HttpListener {
        void onSuccess(String jsonStr);

        void onError(String error);
    }

    private HttpListener httpListener;

    public void setHttpListener(HttpListener httpListener) {
        this.httpListener = httpListener;
    }
}


