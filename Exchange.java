package com.example.monthlybill;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Exchange extends AppCompatActivity {


    EditText s1,s2,s3;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
        send=(Button)findViewById(R.id.ebutton);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendtdata();
            }
        });
    }
    private void sendtdata() {
        s1 = (EditText) findViewById(R.id.stoo);
        s2 = (EditText) findViewById(R.id.eto1);
        s3 = (EditText) findViewById(R.id.eenteramount);

        final String accountto = s1.getText().toString().trim();
        final String accountfrom = s2.getText().toString().trim();
        final String amount = s3.getText().toString().trim();




    }
}