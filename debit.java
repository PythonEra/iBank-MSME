package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class debit extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debit);
        btn1 = findViewById(R.id.dbtrbutton);
        btn2 = findViewById(R.id.dbtinbutton);
        btn3 = findViewById(R.id.dbtblockbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opendbt();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opendpin();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openblockdbt();
            }
        });
    }

    private void openblockdbt() {
        Intent intent = new Intent(debit.this, debitblock.class);
        startActivity(intent);
    }

    private void opendpin() {
        Intent intent = new Intent(debit.this, debitpingeneration.class);
        startActivity(intent);
    }

    private void opendbt() {
        Intent intent = new Intent(debit.this, debitrequest.class);
        startActivity(intent);
    }
}