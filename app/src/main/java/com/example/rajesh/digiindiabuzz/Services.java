package com.example.rajesh.digiindiabuzz;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Services extends AppCompatActivity {
    int f1=0,f2=0,f3=0;
Animation animation1,animation2;
    LinearLayout l1,l2;
    ImageView img1,img2,img3;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        this.setTitle("Services");
        animation1= AnimationUtils.loadAnimation(this,R.anim.zoomin);
        animation2=AnimationUtils.loadAnimation(this,R.anim.zoomout);
        img1=(ImageView)findViewById(R.id.androidapp);
        l1=(LinearLayout)findViewById(R.id.branding);
        l2=(LinearLayout)findViewById(R.id.website);
      //  img2=(ImageView)findViewById(R.id.webapp);
       // img3=(ImageView)findViewById(R.id.cms);
        final ObjectAnimator animStage1 = (ObjectAnimator) AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.flip1);
        final ObjectAnimator animStage2 = (ObjectAnimator) AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.flip2);

        animStage1.setTarget(l1);
        animStage1.setDuration(1500);
        animStage2.setTarget(l1);
        animStage2.setDuration(1500);
        animStage1.start();
        animStage1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }
            @Override
            public void onAnimationEnd(Animator animation) {
                animStage2.start();
            }
            @Override
            public void onAnimationCancel(Animator animation) {

            }
            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Services.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
