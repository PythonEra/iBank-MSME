package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Card_Service extends AppCompatActivity {

    GridLayout cardservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_service);

        cardservice =(GridLayout) findViewById(R.id.cardservice);
        setSingleEvent(cardservice);
    }

    private void setSingleEvent(GridLayout cardservice) {

        for(int i=0;i<cardservice.getChildCount();i++)
        {
            CardView cardView =(CardView)cardservice.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(Card_Service.this,Debit_Card.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(Card_Service.this,Debit_Card.class);
                        startActivity(intent);
                    }

                    else if(finalI==2)
                    {
                        Intent intent = new Intent(Card_Service.this,Debit_Card.class);
                        startActivity(intent);
                    }

                    else if(finalI==3)
                    {
                        Intent intent = new Intent(Card_Service.this,Debit_Card.class);
                        startActivity(intent);
                    }
                    else if(finalI==4)
                    {
                        Intent intent = new Intent(Card_Service.this,Debit_Card.class);
                        startActivity(intent);
                    }
                    else if(finalI==5)
                    {
                        Intent intent = new Intent(Card_Service.this,MobileNo.class);
                        startActivity(intent);
                    }
                    else if(finalI==6)
                    {
                        Intent intent = new Intent(Card_Service.this,CardLimit.class);
                        startActivity(intent);
                    }
                    else if(finalI==7)
                    {
                        Intent intent = new Intent(Card_Service.this,CardPin.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}