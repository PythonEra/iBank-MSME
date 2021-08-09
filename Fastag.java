package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Fastag extends AppCompatActivity {

    GridLayout fastag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastag);

        fastag =(GridLayout) findViewById(R.id.fastag);
        setSingleEvent(fastag);
    }

    private void setSingleEvent(GridLayout fastag) {

        for(int i=0;i<fastag.getChildCount();i++)
        {
            CardView cardView =(CardView)fastag.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(Fastag.this,Recharge.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(Fastag.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==2)
                    {
                        Intent intent = new Intent(Fastag.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==3)
                    {
                        Intent intent = new Intent(Fastag.this,Recharge.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
