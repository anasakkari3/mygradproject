package com.example.mygradproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
    }

    // String v = getIntent().getExtras().getString("batee5a");
    public void add(View view) {
        Intent intent = new Intent(this, page3.class);
        intent.putExtra("book", "add");
        startActivity(intent);

    }

    public void sub(View view) {
        Intent intent = new Intent(this, page3.class);
        intent.putExtra("book", "sub");
        startActivity(intent);

    }

    public void multi(View view) {
        Intent intent = new Intent(this, page3.class);
        intent.putExtra("book", "multi");
        startActivity(intent);

    }

    public void div(View view) {
        Intent intent = new Intent(this, page3.class);
        intent.putExtra("book", "div");
        startActivity(intent);

    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),loginactivity.class));
        finish();
    }
    public void guide (View view){
        Intent intent=new Intent(this,guide.class);
        intent.putExtra("book", "books");
        startActivity(intent);


    }
}