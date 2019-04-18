package com.example.l.medhelper.Activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.l.medhelper.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(LoadingActivity.this);
                    if (sharedPref.getString("username", null) != null) {
                        Intent intent = new Intent(LoadingActivity.this, MarzPageActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Intent intent = new Intent(LoadingActivity.this, InfoActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }, 2000);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(LoadingActivity.this);
                if (sharedPref.getString("username", null) != null) {
                    Intent intent = new Intent(LoadingActivity.this, MarzPageActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(LoadingActivity.this, InfoActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);
    }
}
