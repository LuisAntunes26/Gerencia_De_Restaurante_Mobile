package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void loginSignUpButton(View view) {

        Intent intent = new Intent(this, SignUp_Page.class);
        startActivity(intent);
    }

    public void loginButtonSignIn(View view) {
        //TODO Username and Password verification Process

        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);

    }

    public void forgotPasswordLogin(View view) {
        //TODO Password Recovery Process
        Intent intent = new Intent(this,ForgotPasswordActivity.class);
        startActivity(intent);
    }
}