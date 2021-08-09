package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class atm extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);
        btn1 = findViewById(R.id.atmrbutton);
        btn2 = findViewById(R.id.atmpinbutton);
        btn3 = findViewById(R.id.atmblockbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openatmrequest();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openpingen();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openbolock();
            }
        });
    }

    private void openbolock() {

        Intent intent = new Intent(atm.this, atmblock.class);
        startActivity(intent);

    }

    private void openpingen() {
        Intent intent = new Intent(atm.this, atmpin.class);
        startActivity(intent);

    }

    private void openatmrequest() {
        Intent intent = new Intent(atm.this, atmrequest.class);
        startActivity(intent);

    }
}