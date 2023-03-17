package com.example.goojara;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class splashGoojara extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.P)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Goojara);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        },4000);
    }
}
