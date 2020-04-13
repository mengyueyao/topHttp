package com.followers.tophttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.followers.toplibrary.util.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.setDebug(true);

        Utils.setContext(this);

        Utils.setBaseUrl("http://api.chenjia1992.top/");


    }

}
