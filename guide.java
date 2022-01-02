package com.example.mygradproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.HttpCookie;

public class guide extends AppCompatActivity {



    int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ImageView x=findViewById(R.id.explain);
        TextView g1 =findViewById(R.id.g1);
        Button roll =findViewById(R.id.roll);
        ImageButton m =findViewById(R.id.youtube);
        String b1 = getIntent().getExtras().getString("book");
        if (b1.equals("main")||b1.equals("books")){
            change(roll ,x , g1,m);

        }
        if (b1.equals("add")){
            //exp 5
            m.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-ou9VvyJNOY"));
                    startActivity(browserIntent);
                }
            });
            x.setImageResource(R.drawable.exp5);
            g1.setText("The addition is taking two or more numbers and adding them together, that is, it is the total sum of 2 or more numbers.");
        }
        if (b1.equals("sub")){
            //exp 7
            m.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qM7B2nwpV1M"));
                    startActivity(browserIntent);
                }
            });
            x.setImageResource(R.drawable.exp7);
            g1.setText("In math, to subtract means to take away from a group or a number of things. When we subtract, the number of things in the group reduce or become less.");


        }
        if (b1.equals("multi")){
            //exp 8
            m.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eW2dRLyoyds"));
                    startActivity(browserIntent);
                }
            });
            x.setImageResource(R.drawable.exp8);
            g1.setText("In math, the meaning of a multiple is the product result of one number multiplied by another number..");
        }
        if (b1.equals("div")){
            //exp 9
            m.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-ou9VvyJNOY"));
                    startActivity(browserIntent);
                }
            });
            x.setImageResource(R.drawable.exp9);
            g1.setText("The division is an operation inverse of multiplication. If 3 groups of 4 make 12 in multiplication; 12 divided into 3 equal groups give 4 in each group in division..");
        }
    }


    public void back (View view){

        String b1 = getIntent().getExtras().getString("page");

        if (b1.equals("page3")){
            Intent intent=new Intent(this,page3.class);
            startActivity(intent);}
        if (b1.equals("main")){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);}
        if (b1.equals("books")){
            Intent intent=new Intent(this,books.class);
            startActivity(intent);}
    }
    public void change (Button r,ImageView x, TextView g1,  ImageButton m ){
        r.setVisibility(View.VISIBLE);
         b = 1;
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b==1){
                    m.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-ou9VvyJNOY"));
                            startActivity(browserIntent);
                        }
                    });
                    x.setImageResource(R.drawable.exp5);
                    g1.setText("The addition is taking two or more numbers and adding them together, that is, it is the total sum of 2 or more numbers.");
                    b++;
                }
                else if (b==2){
                    m.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qM7B2nwpV1M"));
                            startActivity(browserIntent);
                        }
                    });
                    x.setImageResource(R.drawable.exp7);
                    g1.setText("In math, to subtract means to take away from a group or a number of things. When we subtract, the number of things in the group reduce or become less.");
                    b++;
                     }
               else if (b==3){
                    m.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eW2dRLyoyds"));
                            startActivity(browserIntent);
                        }
                    });
                    x.setImageResource(R.drawable.exp8);
                    g1.setText("In math, the meaning of a multiple is the product result of one number multiplied by another number..");
                    b++;
                }
              else  if (b==4){
                    //exp 9
                    m.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-ou9VvyJNOY"));
                            startActivity(browserIntent);
                        }
                    });
                    x.setImageResource(R.drawable.exp9);
                    g1.setText("The division is an operation inverse of multiplication. If 3 groups of 4 make 12 in multiplication; 12 divided into 3 equal groups give 4 in each group in division..");
                    r.setVisibility(View.GONE);
                }

            }
        });


    }



}