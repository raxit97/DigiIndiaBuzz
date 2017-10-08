package com.example.rajesh.digiindiabuzz;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
         int i,flag;
     int voice=1;
    ImageView slideshow;
    TextToSpeech tts;
    AnimatorSet set;
    Animation animation,animation1,animation2;
    int []array=new int[]{R.drawable.pic1,R.drawable.pic2,R.drawable.pic4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        slideshow=(ImageView)findViewById(R.id.slideshow);

        final int[] i = {0};
        final Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                    if(i[0] ==3)
                    i[0] = 0;
                        slideshow.startAnimation(animation);
                       // slideshow.startAnimation(animation2);
                        slideshow.setImageResource(array[i[0]]);
                        i[0]++;
                            h.postDelayed(this,4000);
            }
        },2000);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


         if (id == R.id.aboutus) {
                Intent i=new Intent(MainActivity.this,aboutus.class);
             startActivity(i);
             finish();
            // Handle the camera action
        } else if (id == R.id.services) {
            Intent i=new Intent(this,Services.class);
            startActivity(i);
                finish();

        } else if (id == R.id.clients) {

        } else if (id == R.id.course) {

        } else if (id == R.id.careers) {

        } else if (id == R.id.contacts) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
