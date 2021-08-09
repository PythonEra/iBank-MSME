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

public class debitrequest extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/dbtin.php";

    EditText d1,d2,d3,d4,d5;
    Button d6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debitrequest);

        d6 = (Button) findViewById(R.id.d6);

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertdbt();
            }
        });
    }

    private void insertdbt() {

        d1=(EditText)findViewById(R.id.d1);
        d2=(EditText)findViewById(R.id.d2);
        d3=(EditText)findViewById(R.id.d3);
        d4=(EditText)findViewById(R.id.d4);
        d5=(EditText)findViewById(R.id.d5);


        final String AccountNumber=d1.getText().toString().trim();
        final String Name=d2.getText().toString().trim();
        final String CardType=d3.getText().toString().trim();
        final String Address=d4.getText().toString().trim();
        final String MobileNumer=d5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                d1.setText("");
                d2.setText("");
                d3.setText("");
                d4.setText("");
                d5.setText("");

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
                param.put("d1",AccountNumber);
                param.put("d2",Name);
                param.put("d3",CardType);
                param.put("d4",Address);
                param.put("nd5",MobileNumer);


                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }

}
