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

public class AddBalance extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/db_send.php";

    EditText s1,s2,s3;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_balance);
        send=(Button)findViewById(R.id.addb);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendtdata();
            }
        });
    }

    private void sendtdata()
    {
        s2=(EditText)findViewById(R.id.eform1);
        s1=(EditText)findViewById(R.id.stoo);
        s3=(EditText)findViewById(R.id.aaamount);

        final String accountto=s1.getText().toString().trim();
        //final String accountfrom=s2.getText().toString().trim();
        final String amount=s3.getText().toString().trim();


        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                s1.setText("");
                //s2.setText("");
                s3.setText("");
                Toast.makeText(getApplicationContext(),response.toString(),Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError
            {
                Map<String,String> param=new HashMap<String,String>();
                param.put("s1",accountto);
               // param.put("s2",accountfrom);
                param.put("s3",amount);
                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }
}