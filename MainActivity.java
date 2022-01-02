package com.example.mygradproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

   public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(context, R.raw.back);
    }



    public void gotologin (View view){
        Intent intent=new Intent(this,register.class);
        startActivity(intent);
        try {
            if (mp.isPlaying()) {
                mp.stop();
                mp.release();
                mp = MediaPlayer.create(context, R.raw.back);
            }
            mp.start();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void guide (View view){
        Intent intent=new Intent(this,guide.class);
        intent.putExtra("book", "main");
        startActivity(intent);
    }

}