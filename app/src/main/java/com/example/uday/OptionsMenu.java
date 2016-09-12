package com.example.uday;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.uday.sunshine.R;

import java.util.List;

/**
 * Created by uday on 8/13/2016.
 */
public class OptionsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater infalter=getMenuInflater();
        infalter.inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share :
                Intent c = new Intent();
                c.setAction(Intent.ACTION_SEND);
                c.setType("text/plain");
                c.putExtra(Intent.EXTRA_TEXT,"Hi");
                Intent d = Intent.createChooser(c,"choose as your wish");
                startActivity(d);
                break;
            case R.id.settings:
                Toast.makeText(this, "you have clicked on settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.aboutus:
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("https://developer.android.com/guide/topics/ui/menus.html");
                i.setData(uri);
                startActivity(i);
                break;
            case R.id.help :
                Intent a = new Intent(this,MainActivity.class);
                startActivity(a);
        }






        return super.onOptionsItemSelected(item);
    }
}
