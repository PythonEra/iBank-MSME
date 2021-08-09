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

public class chequerequest extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/db_crequest.php";

    EditText s1,s2,s3,s4;
    Button request1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chequerequest);
        request1.findViewById(R.id.brequest);
        request1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestcheque();
            }
        });
    }

    private void requestcheque() {

        s1 =(EditText)findViewById(R.id.eaccno);
        s2 =(EditText)findViewById(R.id.ename);
        s3 =(EditText)findViewById(R.id.enop);
        s4 =(EditText)findViewById(R.id.eaddress);

        final String accountno=s1.getText().toString().trim();
        final String name = s2.getText().toString().trim();
        final String nop = s3.getText().toString().trim();
        final  String address = s4.getText().toString().trim();

        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                s1.setText("");
                s2.setText("");
                s3.setText("");
                s4.setText("");

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
                param.put("s1",accountno);
                param.put("s2",name);
                param.put("s3",nop);
                param.put("s4",address);
                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);


    }
}