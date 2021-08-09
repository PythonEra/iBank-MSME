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

public class debitblock extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/dbtblock.php";

    EditText r1,r2,r3,r4,r5;
    Button r6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debitblock);


        r6=(Button)findViewById(R.id.r6);

        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inserbtblock();
            }
        });
    }

    private void inserbtblock() {


        r1=(EditText)findViewById(R.id.r1);
        r2=(EditText)findViewById(R.id.r2);
        r3=(EditText)findViewById(R.id.r3);
        r4=(EditText)findViewById(R.id.r4);
        r5=(EditText)findViewById(R.id.r5);



        final String AccountNumber=r1.getText().toString().trim();
        final String Cardnumber=r2.getText().toString().trim();
        final String CardType=r3.getText().toString().trim();
        final String Reson=r4.getText().toString().trim();
        final String MobileNumer=r5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                r1.setText("");
                r2.setText("");
                r3.setText("");
                r4.setText("");
                r5.setText("");

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
                param.put("r1",AccountNumber);
                param.put("r2",Cardnumber);
                param.put("r3",CardType);
                param.put("r4",Reson);
                param.put("r5",MobileNumer);


                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }
}