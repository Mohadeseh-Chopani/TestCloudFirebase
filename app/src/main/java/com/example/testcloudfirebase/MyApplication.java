package com.example.testcloudfirebase;

import android.app.Application;
import android.renderscript.Allocation;

import com.google.firebase.FirebaseApp;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);
    }
}
