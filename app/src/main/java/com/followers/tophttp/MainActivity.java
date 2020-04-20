package com.followers.tophttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.followers.toplibrary.bean.CommBean;
import com.followers.toplibrary.http.HttpListener;
import com.followers.toplibrary.http.HttpUtil;
import com.followers.toplibrary.util.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.setDebug(true);

        Utils.setContext(this);

        Utils.setBaseUrl("http://api.chenjia1992.top/");

        new Thread(new Runnable() {
            @Override
            public void run() {

                HttpUtil.uploadImage(MainActivity.this, "http://img.doutula.com/production/uploads/image/2020/04/14/20200414848627_paXcBe.jpg", new HttpListener<CommBean>() {
                    @Override
                    public void onSuccess(CommBean bean) {

                    }

                    @Override
                    public void onError(String error) {

                    }
                });
            }
        }).start();



    }

}
