package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edEmail, edPass;
    Button btnLogin;
    TextView tvRegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail = findViewById(R.id.edEmail);
        edPass = findViewById(R.id.edPass);
        btnLogin = findViewById(R.id.btnLogin);
        tvRegi = findViewById(R.id.tvRegi);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail, userPass;
                userEmail = edEmail.getText().toString();
                userPass = edPass.getText().toString();

                if(userEmail.equals("")){
                    Toast.makeText(MainActivity.this, "Email Required", Toast.LENGTH_SHORT).show();
                }
                if(userPass.equals("")){
                    Toast.makeText(MainActivity.this, "Password Required", Toast.LENGTH_SHORT).show();
                }
                else{
                    //Authentication

                }
            }
        });

        tvRegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regiIntent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(regiIntent);
                finish();
            }
        });
    }
}
