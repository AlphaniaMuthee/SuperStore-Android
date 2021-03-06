package com.moringaschool.asuper.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.moringaschool.asuper.R;

public class LoginActivity extends AppCompatActivity {

    Button signUp;
    Button login;
    EditText mEmail, mPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        signUp = findViewById(R.id.signUp);
        login = findViewById(R.id.login);
        mEmail = findViewById(R.id.emailAddress);
        mPassword = findViewById(R.id.password);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LoginActivity.this, Signup.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress = mEmail.getText().toString();
                String password = mPassword.getText().toString();
                Intent intent = new Intent(LoginActivity.this, MerchantActivity.class);
                intent.putExtra("email", emailAddress);
                intent.putExtra("password", password);
                startActivity(intent);
                finish();
            }
        });
    }
}