package com.darkness.WSafety;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ContactActivity extends AppCompatActivity {
    EditText contact;
    RecyclerView recyclerView;
    HashMap<String,String> contacts;
    ArrayList<String> send;
   // ContactsAdapter adapter;
    ImageView edit;
    TextView callerInfo;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this,MainActivity.class));
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button policeButton = findViewById(R.id.btn_police);
        Button hospitalButton = findViewById(R.id.btn_hospital);
        Button restoButton = findViewById(R.id.btn_resto);

        policeButton.setOnClickListener(v -> {
            String searchQuery = "Near by Toll gates";
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + searchQuery);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });


        hospitalButton.setOnClickListener(v -> {
            String searchQuery = "Near by Hospitals";
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + searchQuery);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        restoButton.setOnClickListener(v -> {
            String searchQuery = "Near by Restaurants";
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + searchQuery);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });


    }



}
