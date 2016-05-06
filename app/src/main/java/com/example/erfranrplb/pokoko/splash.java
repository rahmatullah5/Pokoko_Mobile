package com.example.erfranrplb.pokoko;

/**
 * Created by ErfranRplB on 27/12/2015.
 */

import android.app.*;
import android.content.*;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class splash extends Activity{
    private static int splashI = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, splashI);
    }
}
