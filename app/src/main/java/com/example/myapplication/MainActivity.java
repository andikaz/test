package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        MenuInflater inflater=
                getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
            return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menu1) {
            startActivity(new Intent(this, MENU1.class));
        } else if (item.getItemId()==R.id.menu2) {
            startActivity(new Intent(this,MENU2.class));
        }else if (item.getItemId()==R.id.menu3 ){
            startActivity(new Intent(this, MENU3.class));
        }
        return true;
    }
}