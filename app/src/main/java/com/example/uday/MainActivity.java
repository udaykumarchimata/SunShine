package com.example.uday;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.uday.sunshine.R;

/**
 * Created by uday on 8/7/2016.
 */
public class MainActivity extends AppCompatActivity {
Button B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calui);
        B1=(Button)findViewById(R.id.B1);
        B2=(Button)findViewById(R.id.B2);
        B1.setOnClickListener(i);
        B2.setOnClickListener(i);
    }

    View.OnClickListener i = new View.OnClickListener() {
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.B1) {
              Intent a= new Intent();
                a.setAction(Intent.ACTION_SEND);
                a.setType("text/plain");
                a.putExtra(Intent.EXTRA_TEXT, "Hi how are you doing today");
                Intent b =Intent.createChooser(a, "choose");
                startActivity(b);
            }
            if(v.getId()==R.id.B2) {
              Intent c = new Intent();
                c.setAction(Intent.ACTION_VIEW);
                Uri d=Uri.parse("https://developer.android.com/training/sharing/send.html");
                c.setData(d);
                Intent e=Intent.createChooser(c,"choose any one");
                startActivity(e);
            }
            }


    };
}
