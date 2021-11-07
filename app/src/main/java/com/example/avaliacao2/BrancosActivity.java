package com.example.avaliacao2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BrancosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brancos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menuvinhos, menu);
        MenuItem mitem = menu.findItem(R.id.mn_brancos);
        mitem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent i = new Intent();
        switch (item.getItemId())
        {
            case R.id.mn_tintos:
                Toast.makeText(this, R.string.tintos_msg, Toast.LENGTH_SHORT).show();
                i.setClass(this, HomeActivity.class);
                startActivity(i);
                return true;
            case R.id.mn_outros:
                Toast.makeText(this, R.string.outros_msg, Toast.LENGTH_SHORT).show();
                i.setClass(this, Outros.class);
                startActivity(i);
                return true;
            default:
                Toast.makeText(this, R.string.brancos_msg, Toast.LENGTH_SHORT).show();
                return true;
                //return super.onOptionsItemSelected(item);
        }
    }
}