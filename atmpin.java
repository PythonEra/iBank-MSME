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

public class atmpin extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/atmpin.php";

    EditText l1,l2,l3,l4,l5;
    Button l6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atmpin);

        l6=(Button)findViewById(R.id.l6);

        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertpin();
            }
        });
    }

    private void insertpin() {

        l1=(EditText)findViewById(R.id.l1);
        l2=(EditText)findViewById(R.id.l2);
        l3=(EditText)findViewById(R.id.l3);
        l4=(EditText)findViewById(R.id.l4);
        l5=(EditText)findViewById(R.id.l5);


        final String AccountNumber=l1.getText().toString().trim();
        final String Cardnumber=l2.getText().toString().trim();
        final String Pin1=l3.getText().toString().trim();
        final String Pin2=l4.getText().toString().trim();
        final String MobileNumer=l5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                l1.setText("");
                l2.setText("");
                l3.setText("");
                l4.setText("");
                l5.setText("");

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
                param.put("l1",AccountNumber);
                param.put("l2",Cardnumber);
                param.put("l3",Pin1);
                param.put("l4",Pin2);
                param.put("l5",MobileNumer);


                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }
    }


