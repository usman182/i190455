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

public class activity_2 extends AppCompatActivity {


    TextView txt1;
    EditText edtxt1;
    EditText edtxt2;
    EditText edtxt3;
    TextView txt2;
    ImageButton imgbt1;
    ImageButton imgbt2;
    ImageButton imgbt3;
    CheckBox checkBox1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txt1 = findViewById(R.id.signin);

        edtxt1 = findViewById(R.id.name);
        edtxt2 = findViewById(R.id.email);
        edtxt3 = findViewById(R.id.password);

        txt2 = findViewById(R.id.show);

        imgbt1 = findViewById(R.id.male);
        imgbt1 = findViewById(R.id.female);
        imgbt1 = findViewById(R.id.unknown);

        checkBox1 = findViewById(R.id.checkbox);

        btn1 = findViewById(R.id.signupbutton);

        // toasts when clicking the sign up button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtxt1.getText().toString();
                String email = edtxt2.getText().toString();
                String password = edtxt3.getText().toString();

                String checkbox = checkBox1.getText().toString();
                if (checkBox1.isChecked() == false) {
                    Toast.makeText(activity_2.this, "Checkbox not checked! Please check it first!!", Toast.LENGTH_SHORT).show();
                }

//                if (imgbt1.callOnClick() == false || imgbt2.callOnClick() == false || imgbt3.callOnClick() == false) {
//                    Toast.makeText(activity_2.this, "Gender not checked! Please select it first!!", Toast.LENGTH_SHORT).show();
//                }

                if (edtxt3.length() == 0) {
                    Toast.makeText(activity_2.this, "Password not entered! Please enter it first!!", Toast.LENGTH_SHORT).show();
                }

                if (edtxt2.length() == 0) {
                    Toast.makeText(activity_2.this, "Email not entered! Please enter it first!!", Toast.LENGTH_SHORT).show();
                }

                if (edtxt1.length() == 0) {
                    Toast.makeText(activity_2.this, "Name not entered! Please enter it first!!", Toast.LENGTH_SHORT).show();
                }

                else {

                startActivity(new Intent(activity_2.this, activity4.class));
                }

            }
        });

        // for showing the password
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt3.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });

        // for sign in
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // setContentView(R.layout.activity_3);
                startActivity(new Intent(activity_2.this, activity_3.class));
            }
        });


    }


}