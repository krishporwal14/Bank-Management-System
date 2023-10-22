package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.os.Bundle;
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
//    MainActivity ma2 = new MainActivity();
    private Button depositButton, withdrawButton, checkBalanceButton, exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //taking buttons in java from xml
        depositButton = findViewById(R.id.depositButton);
        withdrawButton = findViewById(R.id.withdrawButton);
        checkBalanceButton = findViewById(R.id.checkBalanceButton);
        exitButton = findViewById(R.id.exitButton);
        //adding listeners to the buttons
        depositButton.setOnClickListener(this);
        withdrawButton.setOnClickListener(this);
        checkBalanceButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        final Context context = this;
        switch (v.getId()) {
            case R.id.depositButton:
                Intent depositPage = new Intent(context, MainActivity3.class);
                startActivity(depositPage);
                break;
            case R.id.withdrawButton:
                Intent withdrawPage = new Intent(context, MainActivity4.class);
                startActivity(withdrawPage);
                break;
            case R.id.checkBalanceButton:
                Toast.makeText(getApplicationContext(), "Current Balance is: " + MainActivity.balance, Toast.LENGTH_SHORT).show();
                break;
            case R.id.exitButton:
                finish(); // Close the app
                break;
        }
    }
}