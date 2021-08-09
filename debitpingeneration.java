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

public class debitpingeneration extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/dbtpin.php";

    EditText q1,q2,q3,q4,q5;
    Button q6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debitpingeneration);
        q6=(Button)findViewById(R.id.q6);

        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertbpin();
            }
        });
    }

    private void insertbpin() {

        q1=(EditText)findViewById(R.id.q1);
        q2=(EditText)findViewById(R.id.q2);
        q3=(EditText)findViewById(R.id.q3);
        q4=(EditText)findViewById(R.id.q4);
        q5=(EditText)findViewById(R.id.q5);


        final String AccountNumber=q1.getText().toString().trim();
        final String Cardnumber=q2.getText().toString().trim();
        final String Pin1=q3.getText().toString().trim();
        final String Pin2=q4.getText().toString().trim();
        final String MobileNumer=q5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                q1.setText("");
                q2.setText("");
                q3.setText("");
                q4.setText("");
                q5.setText("");

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
                param.put("q1",AccountNumber);
                param.put("q2",Cardnumber);
                param.put("q3",Pin1);
                param.put("q4",Pin2);
                param.put("q5",MobileNumer);


                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }
}