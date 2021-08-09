package com.example.monthlybill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;





        import android.app.ProgressDialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

        import com.android.volley.AuthFailureError;
        import com.android.volley.Request;
        import com.android.volley.RequestQueue;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.StringRequest;
        import com.android.volley.toolbox.Volley;

        import java.util.HashMap;
        import java.util.Map;

public class activity_login extends AppCompatActivity {

    EditText ed_email,ed_password;

    String str_email,str_password;
    String url = "http://192.168.43.141//ibankdb/login.php";

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            ed_email = findViewById(R.id.ed_email);
            ed_password = findViewById(R.id.ed_password);
        }


    public void Login(View view) {

        if(ed_email.getText().toString().equals("")){
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
        }
        else if(ed_password.getText().toString().equals("")){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
        else{


            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please Wait..");

            progressDialog.show();

            str_email = ed_email.getText().toString().trim();
            str_password = ed_password.getText().toString().trim();


            StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();

                    if(response.equalsIgnoreCase("logged in successfully")){

                        ed_email.setText("");
                        ed_password.setText("");
                        startActivity(new Intent(getApplicationContext(),NavigationActivity.class));
                        Toast.makeText(activity_login.this, response, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(activity_login.this, response, Toast.LENGTH_SHORT).show();
                    }

                }
            },new Response.ErrorListener(){

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(activity_login.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<String, String>();
                    params.put("email",str_email);
                    params.put("password",str_password);
                    return params;

                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(activity_login.this);
            requestQueue.add(request);




        }
    }

    public void moveToRegistration(View view) {
        startActivity(new Intent(getApplicationContext(),activity_registration.class));
        finish();
    }
}
