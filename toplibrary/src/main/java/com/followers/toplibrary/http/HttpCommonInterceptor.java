package com.followers.toplibrary.http;


import android.util.Log;

import com.followers.toplibrary.util.AppUtil;
import com.followers.toplibrary.util.Utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import mobile.Mobile;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/**
 * Created by meng on 2017/10/10.
 */

public class HttpCommonInterceptor implements Interceptor {

    private Map<String,String> mHeaderParams = new HashMap<>();


    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        RequestBody requestBody = request.body();
        String bodyString = bodyToString(requestBody);
        if(Utils.isDebug()){
            Log.e("body",bodyString);
        }
        try {
            bodyString = new JSONObject(bodyString).put("platform", "1").toString();
            bodyString = new JSONObject(bodyString).put("package_name", Utils.getContext().getPackageName()).toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        //FormBody.Builder formBody = new FormBody.Builder();
        String encode = Mobile.encrypt(bodyString);
        RequestBody formBody = RequestBody.create(MediaType.parse("application/json"), encode);
        Request.Builder requestBuilder = request.newBuilder();
        try {
            requestBuilder.post(formBody);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Response response=null;
        try{

          response = filterResponse(requestBuilder.build(), chain);
            //response = chain.proceed(requestBuilder.build());
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        //有网络时请求数据，无网络是使用缓存

        if (AppUtil.isNetworkAvailable()) {
            int maxAge = 0 * 60; // 有网络时 设置缓存超时时间0个小时
            response.newBuilder()
                    .header("Cache-Control", "public, max-age=" + maxAge)
                    .removeHeader("Pragma")// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                    .build();
        } else {
            int maxStale = 60 * 60 * 24 * 28; // 无网络时，设置超时为4周
            response.newBuilder()
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                    .removeHeader("Pragma")
                    .build();
       }

        return response;
    }



    public static class Builder{

        HttpCommonInterceptor httpCommonInterceptor;

        public Builder() {
            httpCommonInterceptor = new HttpCommonInterceptor();
        }


        public Builder addHeaderParams(String key, String value){

            httpCommonInterceptor.mHeaderParams.put(key,value);

            return this;
        }

        public HttpCommonInterceptor builder(){

            return httpCommonInterceptor;
        }
    }

    private static String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "did not work";
        }
    }

    private static Response filterResponse(Request request, Chain chain) {
        try {
            Response response = chain.proceed(request);
            ResponseBody responseBody = response.peekBody(Long.MAX_VALUE);
            String result = responseBody.string();
            result = Mobile.decrypt(result);
            if(Utils.isDebug()){
                Log.e("result",result);
            }
            Response.Builder newResponse = new Response.Builder()
                    .request(request)
                    .protocol(response.protocol())
                    .code(response.code())
                    .handshake(response.handshake())
                    .message(response.message())
                    .sentRequestAtMillis(response.sentRequestAtMillis())
                    .receivedResponseAtMillis(response.receivedResponseAtMillis())
                    .headers(response.headers())
                    .networkResponse(response.networkResponse())
                    .cacheResponse(response.cacheResponse())
                    .priorResponse(response.priorResponse())
                    .body(ResponseBody.create(responseBody.contentType(), result));
            Response resp = newResponse.build();
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
