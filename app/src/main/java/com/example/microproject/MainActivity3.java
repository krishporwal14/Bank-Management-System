package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
//    MainActivity ma2 = new MainActivity();
    Button doDeposit;
    EditText depositValue;
    TextView resultDeposit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        doDeposit = (Button) findViewById(R.id.comDeposit);
        depositValue = (EditText) findViewById(R.id.depositVal);
        resultDeposit = (TextView) findViewById(R.id.result);
        doDeposit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        double amt = Double.parseDouble(depositValue.getText().toString());
        MainActivity.balance = MainActivity.balance + amt;
        resultDeposit.setText(amt + " Deposited \n Current Balance is: " + MainActivity.balance);
    }
}