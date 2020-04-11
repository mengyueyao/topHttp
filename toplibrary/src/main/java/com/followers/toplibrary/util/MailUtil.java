package com.followers.toplibrary.util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by meng on 2018/7/7.
 */

public class MailUtil {
    public static void sendEmail(Context mContext,String username,String Email) {

        String email_fk = username+": ";
        String select_email ="Select email application.";
        // String email = SharePreference.getEmail();
        String email =Email;
        Intent i = new Intent(Intent.ACTION_SEND);
        // i.setType("text/plain"); //模拟器请使用这行
        i.setType("message/rfc822"); // 真机上使用这行
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        String msg = String.format(email_fk, "") + "\n************************\n";
        i.putExtra(Intent.EXTRA_TEXT, msg);
        mContext.startActivity(Intent.createChooser(i, select_email));
    }
}