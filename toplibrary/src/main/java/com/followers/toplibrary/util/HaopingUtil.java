package com.followers.toplibrary.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by meng on 2018/7/7.
 */

public class HaopingUtil {

    public static void review(Context context){

        String mAddress = "market://details?id=" + context.getPackageName();
        Intent marketIntent = new Intent("android.intent.action.VIEW");
        marketIntent.setData(Uri.parse(mAddress ));
        context.startActivity(marketIntent);
    }

    public static void update(Context context, String url){

        String mAddress = url;
        Intent marketIntent = new Intent("android.intent.action.VIEW");
        marketIntent.setData(Uri.parse(mAddress ));
        context.startActivity(marketIntent);
    }
}
