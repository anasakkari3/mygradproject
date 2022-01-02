package com.example.mygradproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;




public class page3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

    }
    public void guide (View view){
        Intent intent=new Intent(this,guide.class);
        intent.putExtra("page", "page3");
        String b1 = getIntent().getExtras().getString("book");
        intent.putExtra("book", b1);
        startActivity(intent);

    }
    public void one (View view){
        Intent intent=new Intent(this,page4.class);
        intent.putExtra("level", "one");
        String b1 = getIntent().getExtras().getString("book");
        intent.putExtra("bookl", b1);
        startActivity(intent);

    }
    public void two (View view){
        Intent intent=new Intent(this,page4.class);
        intent.putExtra("level", "two");
        String b1 = getIntent().getExtras().getString("book");
        intent.putExtra("bookl", b1);
        startActivity(intent);
    }
    public void three (View view){
        Intent intent=new Intent(this,page4.class);
        intent.putExtra("level", "three");
        String b1 = getIntent().getExtras().getString("book");
        intent.putExtra("bookl", b1);
        startActivity(intent);
    }
    public void four (View view){
        Intent intent=new Intent(this,page4.class);
        intent.putExtra("level", "four");
        String b1 = getIntent().getExtras().getString("book");
        intent.putExtra("bookl", b1);
        startActivity(intent);

    }
    public void back (View view){
        Intent intent=new Intent(this,books.class);
        startActivity(intent);

    }
}