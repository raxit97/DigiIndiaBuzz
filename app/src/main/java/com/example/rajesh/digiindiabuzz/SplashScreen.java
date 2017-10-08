package com.example.rajesh.digiindiabuzz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;

import java.util.Locale;

public class SplashScreen extends AppCompatActivity {
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(Locale.ENGLISH);
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent i=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(i);
                tts.speak("Welcome to Digi India Buzz",TextToSpeech.QUEUE_FLUSH,null);
                finish();
            }
        },3000);
    }
}
