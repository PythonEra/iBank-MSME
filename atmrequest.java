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

public class atmrequest extends AppCompatActivity {
    private static final String url = "http://192.168.43.141/ibankdb/atmins.php";

    EditText n1,n2,n3,n4,n5;
    Button n6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atmrequest);


        n6 = (Button) findViewById(R.id.n6);

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertatm();
            }
        });
    }

    private void insertatm() {

        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        n3=(EditText)findViewById(R.id.n3);
        n4=(EditText)findViewById(R.id.n4);
        n5=(EditText)findViewById(R.id.n5);


        final String AccountNumber=n1.getText().toString().trim();
        final String Name=n2.getText().toString().trim();
        final String CardType=n3.getText().toString().trim();
        final String Address=n4.getText().toString().trim();
        final String MobileNumer=n5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                n1.setText("");
                n2.setText("");
                n3.setText("");
                n4.setText("");
                n5.setText("");

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
                param.put("n1",AccountNumber);
                param.put("n2",Name);
                param.put("n3",CardType);
                param.put("n4",Address);
                param.put("n5",MobileNumer);


                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }

}
