package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
//    MainActivity ma2 = new MainActivity();
    Button doWithdraw;
    EditText withdrawValue;
    TextView resultWithdraw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        doWithdraw = (Button) findViewById(R.id.comWithdraw);
        withdrawValue = (EditText) findViewById(R.id.withdrawVal);
        resultWithdraw = (TextView) findViewById(R.id.result);
        doWithdraw.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        double amt = Double.parseDouble(withdrawValue.getText().toString());
        if(amt < MainActivity.balance && MainActivity.balance > 0) {
            MainActivity.balance = MainActivity.balance - amt;
            resultWithdraw.setText(amt + " Withdrawn \n Current Balance is: " + MainActivity.balance);
        }
        else {
            Toast.makeText(getApplicationContext(), "Insufficient Balance!!", Toast.LENGTH_SHORT).show();
        }
    }
}