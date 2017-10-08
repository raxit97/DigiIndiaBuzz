package com.example.rajesh.digiindiabuzz;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;

public class aboutus extends AppCompatActivity {
Animation animation;
    ScrollView sv;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("                       About Us");
        sv=(ScrollView)findViewById(R.id.aboutus);
        setContentView(R.layout.activity_aboutus);
        animation= AnimationUtils.loadAnimation(this,R.anim.fadein);
        img=(ImageView)findViewById(R.id.abimg);
        /*final ObjectAnimator animStage1 = (ObjectAnimator) AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.flip1);
        animStage1.setTarget(img);
        animStage1.setDuration(2000);
        animStage1.start();*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(aboutus.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
