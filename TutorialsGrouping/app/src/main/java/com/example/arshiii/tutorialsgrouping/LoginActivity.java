package com.example.arshiii.tutorialsgrouping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Toolbar mToolBAR;
    private Button login_btn;
    private EditText login_username;
    private EditText login_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mToolBAR = (Toolbar) findViewById(R.id.login_toolbar);
        login_btn= (Button) findViewById(R.id.login_btn);
        login_username= (EditText) findViewById(R.id.login_username);
        login_password= (EditText) findViewById(R.id.login_password);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(login_username.getText().toString().equals("admin") && login_password.getText().toString().equals("1234")){
                   Toast.makeText(LoginActivity.this, "Login Succesful..", Toast.LENGTH_SHORT).show();
                   startActivity(new Intent(LoginActivity.this,MainActivity.class));

               }
               else{
                   Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
               }
            }
        });
        setSupportActionBar(mToolBAR);
        getSupportActionBar().setTitle("Login");
    }
}
