package com.example.avaliacao2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class WebSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_site);

        WebView wv = (WebView) findViewById(R.id.wv_website);
        wv.loadUrl("http://www.google.com");
        //Resources r = getResources();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menuvinhos, menu);
        MenuItem mitem = (MenuItem) menu.getItem(R.id.mn_site);
        mitem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        Intent i = new Intent();
        switch (item.getItemId())
        {
            case R.id.mn_tintos:
                Toast.makeText(this, R.string.tintos_msg, Toast.LENGTH_SHORT).show();
                i.setClass(this, HomeActivity.class);
                startActivity(i);
                return true;
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
                Toast.makeText(this, R.string.website_msg, Toast.LENGTH_SHORT).show();
                return true;
        }
    }
}