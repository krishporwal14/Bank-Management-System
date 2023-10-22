package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static double balance = 10000.0;//current balance
    Button loginButton;
    EditText userName, passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.userName);
        passWord = (EditText) findViewById(R.id.passWord);
        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        final Context context = this;
        String un = userName.getText().toString();
        String pw = passWord.getText().toString();
        if((un.equals("admin")) && (pw.equals("admin"))) {
            Intent intent = new Intent(context, MainActivity2.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials!!", Toast.LENGTH_SHORT).show();
        }
    }
}