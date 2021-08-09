package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Loan extends AppCompatActivity {

    GridLayout loan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);


        loan =(GridLayout) findViewById(R.id.loan);
        setSingleEvent(loan);
    }

    private void setSingleEvent(GridLayout loan) {


        for(int i=0;i<loan.getChildCount();i++) {
            CardView cardView = (CardView) loan.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jotform.com/form-templates/application-form/loan-application-forms"));
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jotform.com/form-templates/application-form/loan-application-forms"));
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jotform.com/form-templates/application-form/loan-application-forms"));
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jotform.com/form-templates/application-form/loan-application-forms"));
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jotform.com/form-templates/application-form/loan-application-forms"));
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jotform.com/form-templates/application-form/loan-application-forms"));
                        startActivity(intent);

                    }
                }
            });
        }
    }
}