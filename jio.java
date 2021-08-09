package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class jio extends AppCompatActivity {

    GridLayout jiorecharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jio);

        jiorecharge =(GridLayout) findViewById(R.id.jiorecharge);
        setSingleEvent(jiorecharge);

    }

    private void setSingleEvent(GridLayout jiorecharge) {

        for(int i=0;i<jiorecharge.getChildCount();i++)
        {
            CardView cardView =(CardView)jiorecharge.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(jio.this,Recharge.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(jio.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==2)
                    {
                        Intent intent = new Intent(jio.this,Recharge.class);
                        startActivity(intent);
                    }

                    else if(finalI==3)
                    {
                        Intent intent = new Intent(jio.this,Recharge.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}