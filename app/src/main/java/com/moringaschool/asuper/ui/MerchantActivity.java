package com.moringaschool.asuper.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.moringaschool.asuper.R;

public class MerchantActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView mImage;
    NavigationView mNavigation;
    DrawerLayout drawerLayout;
    Button addadmin, stores, reports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_merchant);

        drawerLayout= findViewById(R.id.drawerLayout);
        addadmin = findViewById(R.id.addadmin);
        stores = findViewById(R.id.stores);
        reports = findViewById(R.id.reports);
        mImage= findViewById(R.id.menuImg);
        mImage.setOnClickListener(this);
        addadmin.setOnClickListener(this);
        stores.setOnClickListener(this);
        reports.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == addadmin){
            Intent intent = new Intent(MerchantActivity.this, AdminInviteActivity.class);
            startActivity(intent);
        }
        if (v == stores){
            Intent intent = new Intent(MerchantActivity.this, ViewAdminsActivity.class);
            startActivity(intent);
        }
        if (v == reports){
            Intent intent = new Intent(MerchantActivity.this, ReportActivity.class);
            startActivity(intent);
        }

    }
}