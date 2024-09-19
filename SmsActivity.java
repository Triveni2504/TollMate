package com.darkness.WSafety;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.widget.EditText;
import android.widget.Toast;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class SmsActivity extends AppCompatActivity {
    Button helpline,login,sign;
    EditText e1,e2;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(SmsActivity.this,MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        helpline = findViewById(R.id.btn_helpline);
        helpline.setOnClickListener(this::helplines);
        sign = findViewById(R.id.acti);
        sign.setOnClickListener(this::status);
        login = findViewById(R.id.check);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add code here to handle button click
                showToast("Your status is Active!");
            }
        });
    }
    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    public void helplines(View view) {
        startActivity(new Intent(SmsActivity.this, HelplineCall.class));

    }

    public void status(View view) {
        startActivity(new Intent(SmsActivity.this, activity_activate.class));

    }




    /*public void stopService(View view) {
        Intent notificationIntent = new Intent(this,ServiceMine.class);
        notificationIntent.setAction("stop");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if(ServiceMine.isRunning){
                getApplicationContext().startForegroundService(notificationIntent);
                Snackbar.make(findViewById(android.R.id.content),"Service Stopped!", Snackbar.LENGTH_LONG).show();
            }
        }else {
            if(ServiceMine.isRunning){
                getApplicationContext().startService(notificationIntent);
                Snackbar.make(findViewById(android.R.id.content),"Service Stopped!", Snackbar.LENGTH_LONG).show();
            }
        }
    }

    public void startServiceV(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (!Settings.canDrawOverlays(this)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:" + getPackageName()));
                startActivity(intent);
            }
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED  ) {
            Intent notificationIntent = new Intent(this,ServiceMine.class);
            notificationIntent.setAction("Start");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                getApplicationContext().startForegroundService(notificationIntent);
                Snackbar.make(findViewById(android.R.id.content),"Service Started!", Snackbar.LENGTH_LONG).show();
            }else {
                getApplicationContext().startService(notificationIntent);
                Snackbar.make(findViewById(android.R.id.content),"Service Started!", Snackbar.LENGTH_LONG).show();
            }
        }
    }*/
}