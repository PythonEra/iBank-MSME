package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Gas extends AppCompatActivity {

    GridLayout gas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas);

        gas =(GridLayout) findViewById(R.id.gas);
        setSingleEvent(gas);
    }

    private void setSingleEvent(GridLayout gas) {

        for(int i=0;i<gas.getChildCount();i++)
        {
            CardView cardView =(CardView)gas.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(Gas.this,Recharge.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(Gas.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==2)
                    {
                        Intent intent = new Intent(Gas.this,Recharge.class);
                        startActivity(intent);
                    }

                   
                }
            });
        }
    }
}