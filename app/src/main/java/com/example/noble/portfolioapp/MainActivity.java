package com.example.noble.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void SpotifyMethod(View view){
        Toast.makeText(MainActivity.this, "Spotify Button Clicked!", Toast.LENGTH_SHORT).show();
    }
    
    public void ScoresMethod(View view){
        Toast.makeText(MainActivity.this, "Scores Button Clicked!", Toast.LENGTH_SHORT).show();
    }
    
    public void LibraryMethod(View view){
        Toast.makeText(MainActivity.this, "Library Button Clicked!", Toast.LENGTH_SHORT).show();
    }
    
    public void BuildItBiggerMethod(View view){
        Toast.makeText(MainActivity.this, "Build it Bigger Button Clicked!", Toast.LENGTH_SHORT).show();
    }
    
    public void ReaderMethod(View view){
        Toast.makeText(MainActivity.this, "Reader Button Clicked!", Toast.LENGTH_SHORT).show();
    }
    
    public void CapstoneMethod(View view){
        Toast.makeText(MainActivity.this, "Capstone Button Clicked!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
