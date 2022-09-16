package com.muhammadusman.i190455;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class activity_3 extends AppCompatActivity {

    TextView txt1;
    EditText edtxt1;
    EditText edtxt2;
    TextView txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        txt1 = findViewById(R.id.signup);

        edtxt1 = findViewById(R.id.email);
        edtxt2 = findViewById(R.id.password);

        txt2 = findViewById(R.id.show);

        btn1 = findViewById(R.id.signinbutton);

        // toasts when clicking the sign in button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtxt1.getText().toString();
                String password = edtxt2.getText().toString();

                if (edtxt1.length() == 0) {
                    Toast.makeText(activity_3.this, "Email not entered! Please enter it first!!", Toast.LENGTH_SHORT).show();
                }

                if (edtxt2.length() == 0) {
                    Toast.makeText(activity_3.this, "Password not entered! Please enter it first!!", Toast.LENGTH_SHORT).show();
                }

                else {
                    startActivity(new Intent(activity_3.this, activity4.class));
                }

            }
        });

        // for showing the password
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });

        // for sign up
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(activity_3.this, activity_2.class));
            }
        });


    }
}