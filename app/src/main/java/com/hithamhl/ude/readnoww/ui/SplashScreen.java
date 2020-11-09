package com.hithamhl.ude.readnoww.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hithamhl.ude.readnoww.MainActivity;
import com.hithamhl.ude.readnoww.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        moveToMain();
    }

    private void moveToMain(){
        startActivity(new Intent(SplashScreen.this, MainActivity.class));
        finish();
    }
}
