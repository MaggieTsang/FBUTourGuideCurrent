package com.example.ekok.fbutourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ekok.fbutourguideapp.Login.UserLogin;
import com.example.ekok.fbutourguideapp.Login.UserType;
import com.facebook.FacebookSdk;
import com.facebook.Profile;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_launcher);

        if (Profile.getCurrentProfile().getId() != null) {
            Intent i = new Intent(this, UserType.class);
            this.startActivity(i);
            this.finishActivity(0);
        }
        else {
            Intent i = new Intent(this, UserLogin.class);
            this.startActivity(i);
            this.finishActivity(0);
        }
    }
}
