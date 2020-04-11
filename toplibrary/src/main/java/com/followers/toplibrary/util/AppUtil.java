package com.followers.toplibrary.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.text.TextUtils;

import java.util.List;
import java.util.UUID;


public class AppUtil {

    public static <T> boolean notEmpty(List<T> list) {
        return !isEmpty(list);
    }

    public static <T> boolean isEmpty(List<T> list) {
        if (null == list || list.size() == 0) {
            return true;
        }
        return false;
    }

    // 判断网络是否可用
    public static boolean isNetworkAvailable() {

        try {
            ConnectivityManager connectivity = (ConnectivityManager) Utils.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            if (connectivity != null) {
                NetworkInfo info = connectivity.getActiveNetworkInfo();
                if (info != null && info.isConnected()) {
                    if (info.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
        return false;
    }

    // WiFi是否连接
   /* public static boolean isWiFiAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) Utils.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
            return true;
        }
        return false;
    }*/

    // 获取当前应用的版本号名称
    public static String getVersionName(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            PackageInfo packInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            String version = packInfo.versionName;
            if (!TextUtils.isEmpty(version)) {
                return "" + version;
            }
        } catch (Exception e) {
            e.printStackTrace();

            return "未获取到当前版本信息";
        }
        return "1.0.0";
    }

    // 获取当前应用的版本号
    public static int getVersionCode(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            PackageInfo packInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            return packInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return 1;
    }

    /**
     * 得到应用程序名称
     * get the name of the application
     *
     * @return 应用名称
     * application name
     */
    public static String getAPPName(Context context) {
        PackageInfo mPackageInfo=null;
        mPackageInfo=getPackageInfo(context);
        if (mPackageInfo != null) {
            return mPackageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
        }
        return "未知";
    }

    /**
     * 得到包名相关信息
     * get the package information
     *
     * @return
     */
    public static PackageInfo getPackageInfo(Context context) {
        PackageInfo mPackageInfo=null;
        try {
            mPackageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return mPackageInfo;
    }


    public static String getDeviceId(Context context) {
        String androidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (androidId == null) {
            return UUID.randomUUID().toString();
        }
        return androidId;
    }



}