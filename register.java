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

public class register extends AppCompatActivity {
    EditText name,pass1,pass2,email;
    ImageButton submit;
    ProgressBar progressBar2;
    FirebaseAuth fAuth;
    TextView blogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.name);
        pass1=findViewById(R.id.pass1);
        pass2=findViewById(R.id.pass2);
        email=findViewById(R.id.email);
        submit=findViewById(R.id.submit);
        blogin=findViewById(R.id.blogin);


        progressBar2=findViewById(R.id.progressBar2);

        fAuth=FirebaseAuth.getInstance();
        if (fAuth.getCurrentUser() !=null){
            startActivity(new Intent(getApplicationContext(),books.class));
            finish();

        }
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String memail =email.getText().toString().trim();
                String passward =pass1.getText().toString().trim();
                if(TextUtils.isEmpty(memail)){
                    email.setError("email is required");
                    return;
                }
                if(TextUtils.isEmpty(passward)){
                    email.setError("passward is required");
                    return;
                }
                if (passward.length()<6){
                    email.setError("passward must be >6 chars");
                    return;

                }
                progressBar2.setVisibility(view.VISIBLE);
                //register user fb
                fAuth.createUserWithEmailAndPassword(memail,passward).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(register.this,"user created.",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),books.class));
                        }
                        else {
                            Toast.makeText(register.this,"error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            progressBar2.setVisibility(View.GONE);
                        }
                    }
                });

            }
        });
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),loginactivity.class));
            }
        });

    }


    }
