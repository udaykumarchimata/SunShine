package com.example.uday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.uday.sunshine.R;

/**
 * Created by uday on 7/22/2016.
 */
public class Login extends AppCompatActivity implements View.OnClickListener{
    Button B1,B2,B3,B4;
    EditText ET1,ET2;
    TextView  TV;
     Double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calui);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        ET1 = (EditText) findViewById(R.id.ET1);
        TV = (TextView) findViewById(R.id.TV);
        B1.setOnClickListener(this);
       B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);



    }
     public void onClick(View v) {


if (ET2.getText().toString().trim() != null& (ET1.getText().toString().trim() != null)) {
             b = Double.parseDouble(ET2.getText().toString().trim());
             a = Double.parseDouble(ET1.getText().toString().trim());
             switch (v.getId()) {


                 case R.id.B1:

                     c = a + b;
                     TV.setText("The result is " + Double.toString(c));
                     break;
                 case R.id.B2:
                     c = a - b;
                     TV.setText("The result is " + Double.toString(c));
                     break;
                 case R.id.B3:
                     c = a * b;
                     TV.setText("The result is " + Double.toString(c));
                     break;
                 case R.id.B4:
                     c = a / b;
                     TV.setText("The result is " + Double.toString(c));
                     break;

             }
         }
         else {
    TV.setText("Please enter desired input values");
}


    }
}

