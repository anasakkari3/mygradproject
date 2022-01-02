package com.example.mygradproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.liuguangqiang.cookie.CookieBar;

import java.util.Random;

public class page4 extends AppCompatActivity {


    Button a1,next;
    Button a2;
    Button a3;
    TextView round;
    int x;
    int y;
    int z;
    MediaPlayer mp;
    MediaPlayer mp2;
    Context context = this;
    String book;
    String level;
    TextView tt;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
      tt = findViewById(R.id.tt1);
        book = getIntent().getExtras().getString("bookl");
        level = getIntent().getExtras().getString("level");
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        next = findViewById(R.id.next);
        round = findViewById(R.id.round);
        mp = MediaPlayer.create(context, R.raw.sound1);
        mp2 = MediaPlayer.create(context, R.raw.sound2);
        i=2;

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a1.getTag().toString().equals("correct")) {
                    try {
                        if (mp.isPlaying()) {
                            mp.stop();
                            mp.release();
                            mp = MediaPlayer.create(context, R.raw.sound1);
                        }
                        mp.start();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i<=4){
                        rounds(i);
                        Toast.makeText(page4.this, "gooooood", Toast.LENGTH_SHORT).show();
                    }
                    i++;
                    if (i>4){
                        Toast.makeText(page4.this, "you are complete this level", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), books.class);
                        startActivity(intent);
                        finish();

                    }
                } else {
                    try {
                        if (mp2.isPlaying()) {
                            mp2.stop();
                            mp2.release();
                            mp2 = MediaPlayer.create(context, R.raw.sound2);
                        }
                        mp2.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a2.getTag().toString().equals("correct")) {
                    try {
                        if (mp.isPlaying()) {
                            mp.stop();
                            mp.release();
                            mp = MediaPlayer.create(context, R.raw.sound1);
                        }
                        mp.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i<=4){
                        rounds(i);
                        Toast.makeText(page4.this, "gooooood", Toast.LENGTH_SHORT).show();
                    }
                    i++;
                    if (i>4){
                        Toast.makeText(page4.this, "you are complete this level", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), books.class);

                        finish();

                    }



                } else {
                    try {
                        if (mp2.isPlaying()) {
                            mp2.stop();
                            mp2.release();
                            mp2 = MediaPlayer.create(context, R.raw.sound2);
                        }
                        mp2.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a3.getTag().toString().equals("correct")) {
                    try {
                        if (mp.isPlaying()) {
                            mp.stop();
                            mp.release();
                            mp = MediaPlayer.create(context, R.raw.sound1);
                        }
                        mp.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i<=4){
                        rounds(i);
                        Toast.makeText(page4.this, "gooooood", Toast.LENGTH_SHORT).show();
                    }
                    i++;
                    if (i>4){
                        Toast.makeText(page4.this, "you are complete this level", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), books.class);
                        startActivity(intent);

                        finish();

                    }


                } else {
                    try {
                        if (mp2.isPlaying()) {
                            mp2.stop();
                            mp2.release();
                            mp2 = MediaPlayer.create(context, R.raw.sound2);
                        }
                        mp2.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        x = 0;
        y = 0;
        z = 0;
        if (book.equals("add")) {
            add(x, y, z, level, tt, a1, a2, a3);
        }
        if (book.equals("sub")) {
            sub(x, y, z, level, tt, a1, a2, a3);
        }
        if (book.equals("multi")) {
            multi(x, y, z, level, tt, a1, a2, a3);
        }
        if (book.equals("div")) {
            div(x, y, z, level, tt, a1, a2, a3);
        }


    }

    public static void add(int x, int y, int z, String level, TextView tt, Button a1, Button a2, Button a3) {
        Random rand = new Random();

        if (level.equals("one")) {
            x = rand.nextInt(10 - 1) + 1;
            y = rand.nextInt(10 - 1) + 1;
            resultadd(x, y, a1, a2, a3);
            tt.setText(x + "+" + y);

        }
        if (level.equals("two")) {
            x = rand.nextInt(10);
            y = rand.nextInt(100 - 10) + 10;
            resultadd(x, y, a1, a2, a3);
            tt.setText(x + "+" + y);
        }
        if (level.equals("three")) {
            x = rand.nextInt(100);
            y = rand.nextInt(1000 - 100) + 100;
            resultadd(x, y, a1, a2, a3);
            tt.setText(x + "+" + y);
        }
        if (level.equals("four")) {
            x = rand.nextInt(100);
            y = rand.nextInt(1000 - 100) + 100;
            resultadd(x, y, a1, a2, a3);
            tt.setText(x + "+" + y);
        }
    }
    public static void sub(int x, int y, int z, String level, TextView tt, Button a1, Button a2, Button a3) {
        Random rand = new Random();
        if (level.equals("one")) {
            x = rand.nextInt(10 - 1) + 1;
            y = rand.nextInt(10 - 1) + 1;
            if (y > x) {
                z = x;
                x = y;
                y = z;
            }
            resultsub(x, y, a1, a2, a3);
            tt.setText(x + "-" + y);
        }
        if (level.equals("two")) {
            x = rand.nextInt(100 - 10) + 10;
            y = rand.nextInt(10);
            resultsub(x, y, a1, a2, a3);
            tt.setText(x + "-" + y);

        }
        if (level.equals("three")) {
            x = rand.nextInt(1000 - 100) + 100;
            y = rand.nextInt(100);
            resultsub(x, y, a1, a2, a3);
            tt.setText(x + "-" + y);

        }
        if (level.equals("four")) {
            x = rand.nextInt(10000 - 1000) + 1000;
            y = rand.nextInt(1000);
            resultsub(x, y, a1, a2, a3);
            tt.setText(x + "-" + y);

        }
    }
    public static void multi(int x, int y, int z, String level, TextView tt, Button a1, Button a2, Button a3) {
        Random rand = new Random();
        if (level.equals("one")) {
            x = rand.nextInt(3) + 1;
            y = rand.nextInt(3) + 1;
            resultmulti(x, y, a1, a2, a3);
            tt.setText(x + "x" + y);

        }
        if (level.equals("two")) {
            x = rand.nextInt(7) + 1;
            y = rand.nextInt(7 - 2) + 2;
            resultmulti(x, y, a1, a2, a3);
            tt.setText(x + "x" + y);

        }
        if (level.equals("three")) {
            x = rand.nextInt(7) + 1;
            y = rand.nextInt(10 - 5) + 5;
            resultmulti(x, y, a1, a2, a3);
            tt.setText(x + "x" + y);

        }
        if (level.equals("four")) {
            x = rand.nextInt(10) + 1;
            y = rand.nextInt(15 - 10) + 10;
            resultmulti(x, y, a1, a2, a3);
            tt.setText(x + "x" + y);
        }
    }
    public static void div(int x, int y, int z, String level, TextView tt, Button a1, Button a2, Button a3) {
        Random rand = new Random();
        if (level.equals("one")) {
            x = rand.nextInt(10 - 1) + 1;
            y = rand.nextInt(10 - 1) + 1;
            while (x % y != 0) {
                x = rand.nextInt(10 - 1) + 1;
                y = rand.nextInt(10 - 1) + 1;
            }
            resultdiv(x, y, a1, a2, a3);
            tt.setText(x + "÷" + y);
        }
        if (level.equals("two")) {
            x = rand.nextInt(100 - 10) + 10;
            y = rand.nextInt(10);
            while (x % y != 0) {
                x = rand.nextInt(100 - 10) + 10;
                y = rand.nextInt(10);
            }
            resultdiv(x, y, a1, a2, a3);
            tt.setText(x + "÷" + y);
        }
        if (level.equals("three")) {
            x = rand.nextInt(50 - 10) + 10;
            y = rand.nextInt(50 - 10) + 10;
            while (x % y != 0) {
                x = rand.nextInt(50 - 10) + 10;
                y = rand.nextInt(50 - 10) + 10;
            }
            resultdiv(x, y, a1, a2, a3);
            tt.setText(x + "÷" + y);


        }
        if (level.equals("four")) {
            x = rand.nextInt(100 - 10) + 10;
            y = rand.nextInt(100 - 10) + 10;
            while (x % y != 0) {
                x = rand.nextInt(100 - 10) + 10;
                y = rand.nextInt(100 - 10) + 10;
            }
            resultdiv(x, y, a1, a2, a3);
            tt.setText(x + "÷" + y);
        }
    }
    public static void resultadd(int x, int y, Button a1, Button a2, Button a3) {
        Button a[] = {a1, a2, a3};
        int i = 0;
        int b = 0;
        Random rand = new Random();
        i = rand.nextInt(3);
        int zz = x + y;
        a[i].setText(zz + "");
        a[i].setTag("correct");
        for (int z = 0; z < a.length; z++) {
            if (z != i) {
                int r = zz * 2;
                b = rand.nextInt(r) + 1;
                if (b != zz) {
                    a[z].setText(b + " ");
                    a[z].setTag("");

                }
            }
        }

    }
    public static void resultsub(int x, int y, Button a1, Button a2, Button a3) {
        Button a[] = {a1, a2, a3};
        int i = 0;
        int b = 0;
        Random rand = new Random();
        i = rand.nextInt(3);
        int zz = x - y;
        a[i].setText(zz + "");
        a[i].setTag("correct");
        for (int z = 0; z < a.length; z++) {
            if (z != i) {
                int r = zz * 2;
                b = rand.nextInt(r - 1) + 1;
                if (b != zz) {
                    a[z].setText(b + " ");
                    a[z].setTag("");
                }
            }
        }

    }
    public static void resultmulti(int x, int y, Button a1, Button a2, Button a3) {
        Button a[] = {a1, a2, a3};
        int i = 0;
        Random rand = new Random();
        i = rand.nextInt(3);
        int zz = x * y;
        a[i].setText(zz + "");
        a[i].setTag("correct");
        for (int z = 0; z < a.length; z++) {
            if (z != i) {
                int r = zz * 2;
                int b = rand.nextInt(r - 1) + 1;
                if (b != zz) {
                    a[z].setText(b + " ");
                    a[z].setTag("");
                }
            }
        }

    }
    public static void resultdiv(int x, int y, Button a1, Button a2, Button a3) {
        Button a[] = {a1, a2, a3};
        int i = 0;
        Random rand = new Random();
        i = rand.nextInt(3);
        int zz = x / y;
        a[i].setText(zz + "");
        a[i].setTag("correct");
        for (int z = 0; z < a.length; z++) {
            if (z != i) {
                int r = zz * 2;
                int b = rand.nextInt(r - 1) + 1;
                if (b != zz) {
                    a[z].setText(b + " ");
                    a[z].setTag("");
                }
            }
        }

    }

    public void rounds(int i){
        x = 0;
        y = 0;
        z = 0;
        round.setText("round  "+i);
        if (book.equals("add")) {
            add(x, y, z, level, tt, a1, a2, a3);
        }
        if (book.equals("sub")) {
            sub(x, y, z, level, tt, a1, a2, a3);
        }
        if (book.equals("multi")) {
            multi(x, y, z, level, tt, a1, a2, a3);
        }
        if (book.equals("div")) {
            div(x, y, z, level, tt, a1, a2, a3);
        }

    }


    public void back(View view) {
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);

    }

}