package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class maindservice extends AppCompatActivity {
    GridLayout maingridlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindservice);

        maingridlayout=(GridLayout)findViewById(R.id.grid);
        setSingleEvent(maingridlayout);

    }

    private void setSingleEvent(GridLayout maingridlayout) {

        for(int i = 0;i<maingridlayout.getChildCount();i++){
            CardView cardview = (CardView)maingridlayout.getChildAt(i);

            final int finall = i;
            cardview.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    if(finall==0){
                        Intent intent = new Intent(maindservice.this, card.class);
                        startActivity(intent);

                    }
                    else if(finall==1){
                        Intent intent = new Intent(maindservice.this, cheoque.class);
                        startActivity(intent);

                    }
                    else if(finall==2){
                        Intent intent = new Intent(maindservice.this,history.class);
                        startActivity(intent);

                    }
                    else if(finall==3){
                        Intent intent = new Intent(maindservice.this, security.class);
                        startActivity(intent);

                    }
                    else if(finall==4){
                        Intent intent = new Intent(maindservice.this, personal.class);
                        startActivity(intent);

                    }
                    else if(finall==5){
                        Intent intent = new Intent(maindservice.this, passbook.class);
                        startActivity(intent);

                    }

                }
            });
        }
    }
}