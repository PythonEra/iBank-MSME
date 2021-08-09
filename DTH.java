package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class DTH extends AppCompatActivity {

    GridLayout dth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dth);

        dth =(GridLayout) findViewById(R.id.dth);
        setSingleEvent(dth);

    }

    private void setSingleEvent(GridLayout dth) {

        for(int i=0;i<dth.getChildCount();i++)
        {
            CardView cardView =(CardView)dth.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(DTH.this,Recharge.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(DTH.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==2)
                    {
                        Intent intent = new Intent(DTH.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==3)
                    {
                        Intent intent = new Intent(DTH.this,Recharge.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

}