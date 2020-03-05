 package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class RegistrationActivity extends AppCompatActivity {

     EditText edName, edEmail, edPass, edConPass;
     Button btnRegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edPass = findViewById(R.id.edPass);
        edConPass = findViewById(R.id.edConPass);
        btnRegi = findViewById(R.id.btnRegi);

        btnRegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName, userEmail, userPass, userConPass;

                userName = edName.getText().toString();
                userEmail = edEmail.getText().toString();
                userPass = edPass.getText().toString();
                userConPass = edConPass.getText().toString();

                if(userName.equals("")){
                    Toast.makeText(RegistrationActivity.this, "User Name is required", Toast.LENGTH_SHORT).show();
                }
                if(userEmail.equals("")){
                    Toast.makeText(RegistrationActivity.this, "Password is required", Toast.LENGTH_SHORT).show();
                }
//                if()
            }
        });

    }
}
