package com.example.mygradproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class loginactivity extends AppCompatActivity {

    EditText email, pass1;
    ImageButton submit1;
    ProgressBar progressBar;
    FirebaseAuth fAuth;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        pass1 = findViewById(R.id.password);
        email = findViewById(R.id.email);
        submit1 = findViewById(R.id.submit1);
        register = findViewById(R.id.register);


        progressBar = findViewById(R.id.progressBar);

        fAuth = FirebaseAuth.getInstance();

        submit1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String memail = email.getText().toString().trim();
                String passward = pass1.getText().toString().trim();
                if (TextUtils.isEmpty(memail)) {
                    email.setError("email is required");
                    return;
                }
                if (TextUtils.isEmpty(passward)) {
                    email.setError("password is required");
                    return;
                }
                if (passward.length() < 6) {
                    email.setError("password must be >6 chars");
                    return;

                }
                progressBar.setVisibility(view.VISIBLE);
                //auth user
                fAuth.signInWithEmailAndPassword(memail, passward).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(loginactivity.this, "log in successful.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), books.class));
                        } else {
                            Toast.makeText(loginactivity.this, "error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });


            }


        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),register.class));

            }
        });
    }


}

