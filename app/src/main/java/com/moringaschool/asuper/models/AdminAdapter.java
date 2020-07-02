package com.moringaschool.asuper.models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.asuper.R;

import java.util.ArrayList;

public class AdminAdapter extends RecyclerView.Adapter<AdminAdapter.AdminViewHolder> {
    private ArrayList<AdminItems> mAdminList;
    public static class AdminViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public AdminViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.text);
        }
    }

    public AdminAdapter (ArrayList<AdminItems> adminList) {
        mAdminList = adminList;
    }

    @NonNull
    @Override
    public AdminViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_item, parent, false);
        AdminViewHolder avh = new AdminViewHolder(v);
        return avh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdminViewHolder holder, int position) {
        AdminItems currentItem = mAdminList.get(position);
        holder.mTextView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        return mAdminList.size();
    }
}
