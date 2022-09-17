package com.muhammadusman.i190455;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class activity9 extends AppCompatActivity {

//    EditText edtxt1;
//    EditText edtxt2;
    ImageButton imgbtn1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        imgbtn1 = findViewById(R.id.back);
        btn1 = findViewById(R.id.addplaylist);



        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity9.this, activity8.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity9.this, activity10.class));
            }
        });
    }
}