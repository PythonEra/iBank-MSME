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

public class Debit_Card extends AppCompatActivity {


    private static final String url = "http://192.168.43.141/ibankdb/debitcard.php";

    EditText s1,s2,s3,s4,s5;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debit_card);
        send=(Button)findViewById(R.id.req);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendtdata();
            }
        });

    }
    private void sendtdata()
    {
        s1=(EditText)findViewById(R.id.s1);
        s2=(EditText)findViewById(R.id.s2);
        s3=(EditText)findViewById(R.id.s3);
        s4=(EditText)findViewById(R.id.s4);
        s5=(EditText)findViewById(R.id.s5);


        final String name=s1.getText().toString().trim();
        final String  account=s2.getText().toString().trim();
        final String IFSC=s3.getText().toString().trim();
        final String mobono=s4.getText().toString().trim();
        final String  address=s5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                s1.setText("");
                s2.setText("");
                s3.setText("");
                s4.setText("");
                s5.setText("");

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
                param.put("s1",name);
                param.put("s2",account);
                param.put("s3",IFSC);
                param.put("s4",mobono);
                param.put("s5",address);
                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }
}