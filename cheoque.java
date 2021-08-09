package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cheoque extends AppCompatActivity {
  Button btn1, btn2, btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheoque);
        btn1 = findViewById(R.id.req);
        btn2 = findViewById(R.id.inq);
        btn3 = findViewById(R.id.his);
        btn4 = findViewById(R.id.sto);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openrequest();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openinquiry();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openhistory();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openstopservie13();
            }
        });


    }

    private void openrequest() {
        Intent intent = new Intent(cheoque.this, maincheque.class);
        startActivity(intent);


    }
    private void openinquiry() {
        Intent intent = new Intent(cheoque.this, inqury.class);
        startActivity(intent);


    }
    private void openhistory() {
        Intent intent = new Intent(cheoque.this, historycheque.class);
        startActivity(intent);


    }
    private void openstopservie13() {
        Intent intent = new Intent(cheoque.this, stopcheque.class);
        startActivity(intent);


    }


}