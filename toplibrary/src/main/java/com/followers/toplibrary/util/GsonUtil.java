package com.followers.toplibrary.util;


import android.util.Log;

import com.google.gson.Gson;

public class GsonUtil {

    public static <T> T format(String json,Class<T> classTo){

        try {

            T entity = new Gson().fromJson(json,classTo);

            return entity;

        }catch (Exception e){

            Log.e("error","数据解析异常:"+e.toString());

            return null;
        }


    }
}
