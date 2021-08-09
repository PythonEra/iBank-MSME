package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGridLayout =(GridLayout) findViewById(R.id.mainGridLayout);

        setsingleEvent(mainGridLayout);

    }

    private void setsingleEvent(GridLayout mainGridLayout) {

        for(int i=0;i<mainGridLayout.getChildCount();i++)
        {
            CardView cardView =(CardView)mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(MainActivity.this, jio.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(MainActivity.this,DTH.class);
                        startActivity(intent);
                    }
                    else if(finalI==2)
                    {
                        Intent intent = new Intent(MainActivity.this,Electricity.class);
                        startActivity(intent);
                    }
                    else if(finalI==3)
                    {
                        Intent intent = new Intent(MainActivity.this,Fastag.class);
                        startActivity(intent);
                    }
                    else if(finalI==4)
                    {
                        Intent intent = new Intent(MainActivity.this,Gas.class);
                        startActivity(intent);
                    }
                    else if(finalI==5)
                    {
                        Intent intent = new Intent(MainActivity.this,insurance.class);
                        startActivity(intent);
                    }
                }
            });
        }

    }
}