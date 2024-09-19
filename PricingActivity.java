package com.darkness.WSafety;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class PricingActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(PricingActivity.this,MainActivity.class));
        PricingActivity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricing);



        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(PricingActivity.this,MainActivity.class));
            PricingActivity.this.finish();
        });
    }
}
