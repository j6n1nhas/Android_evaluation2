package com.example.avaliacao2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Outros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outros);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuvinhos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent i = new Intent();
        switch (item.getItemId())
        {
            case R.id.mn_tintos:
                i.setClass(this, HomeActivity.class);
                Toast.makeText(this, R.string.tintos_msg, Toast.LENGTH_SHORT).show();
                startActivity(i);
            case R.id.mn_brancos:
                i.setClass(this, BrancosActivity.class);
                Toast.makeText(this, R.string.brancos_msg, Toast.LENGTH_SHORT).show();
                startActivity(i);
            default:
                Toast.makeText(this, R.string.outros_msg, Toast.LENGTH_SHORT).show();
                return true;
                //return super.onOptionsItemSelected(item);
        }
    }
}