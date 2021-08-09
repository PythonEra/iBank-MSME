package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personal extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        btn1 = findViewById(R.id.uname);
        btn2 = findViewById(R.id.upancard);
        btn3 = findViewById(R.id.uadhar);
        btn4 = findViewById(R.id.uaddres);
        btn5 = findViewById(R.id.upicture);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openname();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openpan();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openaddhar();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openaddress();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openpicturer();
            }
        });


    }

    private void openaddress() {
        Intent intent = new Intent(personal.this, update_address.class);
        startActivity(intent);

    }

    private void openaddhar() {
        Intent intent = new Intent(personal.this, update_aadharcard.class);
        startActivity(intent);
    }

    private void openpicturer() {
        Intent intent = new Intent(personal.this, update_profilephoto.class);
        startActivity(intent);
    }

    private void openpan() {
        Intent intent = new Intent(personal.this, update_pancard.class);
        startActivity(intent);
    }

    private void openname() {
        Intent intent = new Intent(personal.this, update_name.class);
        startActivity(intent);
    }
}