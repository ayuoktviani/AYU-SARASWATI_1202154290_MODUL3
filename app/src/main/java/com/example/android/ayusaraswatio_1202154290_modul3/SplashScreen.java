package com.example.android.ayusaraswatio_1202154290_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    private static int splashInterval = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//command ini digunakan untuk membuat layar aplikasi menjadi full screen//
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(SplashScreen.this, Login.class);
                startActivity(a);
                Toast.makeText(SplashScreen.this, "Selamat Datang", Toast.LENGTH_LONG).show();
                this.finish();//untuk menampilkan pop up tulisan yang kita inginkan//
            }

            private void finish() {

            }
        }, splashInterval);
    }
}
