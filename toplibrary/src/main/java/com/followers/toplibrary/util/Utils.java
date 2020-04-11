package com.followers.toplibrary.util;

import android.content.Context;

public class Utils {

    private static  Context mContext;

    private static boolean debug;

    private static String baseUrl;

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {

        mContext = context;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        Utils.debug = debug;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        Utils.baseUrl = baseUrl;
    }
}
