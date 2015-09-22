package com.rabor.androidtablayoutactivity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class AndroidTabLayoutActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabHost.TabSpec photospec = tabHost.newTabSpec("Photos");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Photos", getResources().getDrawable(
                R.drawable.icon_photos_tab));
        Intent photosIntent = new Intent(this, PhotosActivity.class);
        photospec.setContent(photosIntent);

        // Tab for Songs
        TabHost.TabSpec songsspec = tabHost.newTabSpec("Songs");
        // setting Title and Icon for the Tab
        songsspec.setIndicator("Songs", getResources().getDrawable(
                R.drawable.icon_songs_tab));
        Intent songsIntent = new Intent(this, SongsActivity.class);
       songsspec.setContent(songsIntent);

        // Tab for Videos
        TabHost.TabSpec videosspec = tabHost.newTabSpec("Videos");
        // setting Title and Icon for the Tab
        videosspec.setIndicator("Videos", getResources().getDrawable(
                R.drawable.icon_videos_tab));
        Intent videosIntent = new Intent(this, VideosActivity.class);
        videosspec.setContent(videosIntent);

        // Adding all Tabspec to TabHost
        tabHost.addTab(photospec);  // Adding photos tab
        tabHost.addTab(songsspec);  // Adding songs tab
        tabHost.addTab(videosspec);  // Adding videos tab
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android_tab_layout, menu);
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
}
