package com.example.rajesh.digiindiabuzz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ScrollingActivity extends AppCompatActivity {
ImageView image1,image2,image3;
    Animation animation1,animation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Services");
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        animation1= AnimationUtils.loadAnimation(this,R.anim.fadein);
        animation2=AnimationUtils.loadAnimation(this,R.anim.blink);
        image1=(ImageView)findViewById(R.id.image1);
        image2=(ImageView)findViewById(R.id.image2);
        image3=(ImageView)findViewById(R.id.image3);
        image1.startAnimation(animation1);
        image1.setImageResource(R.drawable.google1);


        image2.setImageResource(R.drawable.google2);
        image2.startAnimation(animation1);


        image3.setImageResource(R.drawable.code3);
        image3.startAnimation(animation1);





       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });  */
    }

    @Override
    public void onBackPressed() {

        Intent i=new Intent(ScrollingActivity.this,MainActivity.class);
        startActivity(i);

        super.onBackPressed();
        this.finish();

    }
}
