package com.moringaschool.asuper.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringaschool.asuper.R;
import com.moringaschool.asuper.models.AdminAdapter;
import com.moringaschool.asuper.models.AdminItems;

import java.util.ArrayList;

public class ViewAdminsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_admins);

        ArrayList<AdminItems> adminList = new ArrayList<>();
        adminList.add(new AdminItems("Shop 1"));
        adminList.add(new AdminItems("Shop 2"));
        adminList.add(new AdminItems("Shop 3"));
        adminList.add(new AdminItems("Shop 4"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new AdminAdapter(adminList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}