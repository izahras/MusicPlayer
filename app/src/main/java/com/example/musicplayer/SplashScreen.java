package com.example.musicplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        checkConnection();
    }
    void Show(){

        new Handler().postDelayed(() -> {
            Intent i=new Intent(SplashScreen.this,MainActivity.class);
            startActivity(i);
            finish();
        },3000);
    }
    protected boolean internet() {
        ConnectivityManager ConnectivityManager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo NetworkInfo = ConnectivityManager.getActiveNetworkInfo();
        return NetworkInfo != null && NetworkInfo.isConnectedOrConnecting();
    }

    public void checkConnection() {
        if (internet())
        {
            Show();
        }
        else
        {
            AlertDialog.Builder Dialog = new AlertDialog.Builder(this);
            View activity = LayoutInflater.from(this).inflate(R.layout.activity_internet,null);
            Dialog.setView(activity);
            AlertDialog alertDialog = Dialog.create();

            alertDialog.setCancelable(false);

            View btnexsit = activity.findViewById(R.id.btnExit);
            View btnretry = activity.findViewById(R.id.btnRetry);

            btnretry.setOnClickListener(view -> {
                alertDialog.dismiss();
                checkConnection();
            });
            btnexsit.setOnClickListener(view -> {
                alertDialog.dismiss();
                finish();
            });

            alertDialog.show();
        }

    }
}

