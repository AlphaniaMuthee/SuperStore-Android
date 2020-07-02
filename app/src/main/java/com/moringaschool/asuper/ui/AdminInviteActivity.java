package com.moringaschool.asuper.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.moringaschool.asuper.R;

public class AdminInviteActivity extends AppCompatActivity implements View.OnClickListener{
    Button mInvite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_invite);

        mInvite = findViewById(R.id.invite);
        mInvite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mInvite) {
            Intent intent= new Intent(AdminInviteActivity.this, MerchantActivity.class);
            startActivity(intent);
        }
    }
}