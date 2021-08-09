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

public class atmblock extends AppCompatActivity {
   private static final String url = "http://192.168.43.141/ibankdb/atmblock.php";

    EditText o1,o2,o3,o4,o5;
    Button o6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atmblock);

        o6=(Button)findViewById(R.id.o6);

        o6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertblock();
            }
        });
    }

    private void insertblock() {


        o1=(EditText)findViewById(R.id.o1);
        o2=(EditText)findViewById(R.id.o2);
        o3=(EditText)findViewById(R.id.o3);
        o4=(EditText)findViewById(R.id.o4);
        o5=(EditText)findViewById(R.id.o5);


        final String AccountNumber=o1.getText().toString().trim();
        final String Cardnumber=o2.getText().toString().trim();
        final String CardType=o3.getText().toString().trim();
        final String Reson=o4.getText().toString().trim();
        final String MobileNumer=o5.getText().toString().trim();



        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                o1.setText("");
                o2.setText("");
                o3.setText("");
                o4.setText("");
                o5.setText("");

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
                param.put("o1",AccountNumber);
                param.put("o2",Cardnumber);
                param.put("o3",CardType);
                param.put("o4",Reson);
                param.put("o5",MobileNumer);


                return param;
            }
        };


        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }


}