package com.example.avaliacao2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menuvinhos, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        Intent i = new Intent();
        switch (item.getItemId())
        {
            case R.id.mn_brancos:
                Toast.makeText(this, R.string.brancos_msg, Toast.LENGTH_SHORT).show();
                i.setClass(this, BrancosActivity.class);
                startActivity(i);
                return true;
            case R.id.mn_outros:
                Toast.makeText(this, R.string.outros_msg, Toast.LENGTH_SHORT).show();
                i.setClass(this, Outros.class);
                startActivity(i);
                return true;
            default:
                Toast.makeText(this, R.string.tintos_msg, Toast.LENGTH_SHORT).show();
                return true;
                //return super.onOptionsItemSelected(item);
        }
    }
}