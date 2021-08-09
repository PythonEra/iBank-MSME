package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Electricity extends AppCompatActivity {

    GridLayout electricity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        electricity =(GridLayout) findViewById(R.id.electricity);
        setSingleEvent(electricity);
    }

    private void setSingleEvent(GridLayout electricity) {

        for(int i=0;i<electricity.getChildCount();i++)
        {
            CardView cardView =(CardView)electricity.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(Electricity.this,Recharge.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(Electricity.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==2)
                    {
                        Intent intent = new Intent(Electricity.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==3)
                    {
                        Intent intent = new Intent(Electricity.this,Recharge.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}