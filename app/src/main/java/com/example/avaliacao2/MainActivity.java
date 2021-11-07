package com.example.avaliacao2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                exibirMensagem();
            }
        }, SPLASH_TIME);
    }

    private void exibirMensagem()
    {
        AlertDialog.Builder msgbox = new AlertDialog.Builder(this);
        msgbox.setTitle(R.string.msg_title);
        msgbox.setIcon(android.R.drawable.ic_menu_info_details);
        msgbox.setMessage(R.string.dialog_message);
        msgbox.setCancelable(false);
        msgbox.setPositiveButton(R.string.opt_positiva, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
        msgbox.setNegativeButton(R.string.opt_negativa, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finish();
            }
        });
        msgbox.show();
    }
}

