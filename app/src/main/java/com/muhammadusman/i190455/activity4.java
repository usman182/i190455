package com.muhammadusman.i190455;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity4 extends AppCompatActivity {

    TextView txt1;
    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        txt1 = findViewById(R.id.signin);

        btn1 = findViewById(R.id.continuewithfacebook);
        btn2 = findViewById(R.id.continuewithgoogle);
        btn3 = findViewById(R.id.createaccount);

        // toasts when clicking the sign in button
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    startActivity(new Intent(activity4.this, activity5.class));


            }
        });


        // for sign up
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(activity4.this, activity_3.class));
            }
        });


    }
}