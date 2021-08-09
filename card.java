package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class card extends AppCompatActivity {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        btn1 = findViewById(R.id.atmbutton);
        btn2 = findViewById(R.id.debitbutton);
        btn3 = findViewById(R.id.sbicardbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openatm();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opendebit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opensbi();
            }
        });


    }

    private void opensbi() {
        Intent intent = new Intent(card.this, atm.class);
        startActivity(intent);

    }


    private void opendebit() {
        Intent intent = new Intent(card.this, debit.class);
        startActivity(intent);
    }


    private void openatm() {

        Intent intent = new Intent( card.this, sbicard.class);
        startActivity(intent);
    }
}

