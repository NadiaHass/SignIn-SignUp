package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        firebaseAuth = FirebaseAuth.getInstance();

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            openActivity();
        }, 2000);

    }

    private void openActivity() {
        if (firebaseAuth.getCurrentUser()!= null)
            startActivity(new Intent(this , MainActivity.class));
        else
            startActivity(new Intent(this , WelcomeActivity.class));

        finish();
    }
}