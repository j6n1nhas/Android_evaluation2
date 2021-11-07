package com.example.avaliacao2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.example.avaliacao2.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Intent intent = getIntent();
            
        }
        catch (Exception e)
        {
            //
        }
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
                //Intent i = new Intent(MainActivity.this, HomeActivity.class);
                //startActivity(i);
                SelectNavMode();
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

    private void SelectNavMode()
    {
        String[] opts = {
                "Login",
                "Registar",
                "Prosseguir",
        };
        Intent intent = new Intent();
        AlertDialog.Builder msgbox = new AlertDialog.Builder(this);
        msgbox.setTitle("Modo de navegação");
        msgbox.setCancelable(false);
        msgbox.setItems(opts, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // O argumento which traz o índice da escolha feita
                switch (which)
                {
                    case 0:
                        Log.i("Botão clicado", opts[which]);
                        intent.setClass(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);
                        return;
                    case 1:
                        Log.i("Botão clicado", opts[which]);
                        break;
                    case 2:
                        Log.i("Botão clicado", opts[which]);
                        intent.setClass(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                        return;
                    default:
                        Log.i("Botão clicado", "Nenhum botão clicado");
                        break;
                }
            }
        }).show();
    }
}

