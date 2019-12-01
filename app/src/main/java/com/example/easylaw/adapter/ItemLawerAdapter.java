package com.example.easylaw.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.easylaw.R;
import com.example.easylaw.item.Lawer;
import com.example.easylaw.viewholder.LawerViewHolder;

import java.util.ArrayList;

public class ItemLawerAdapter extends RecyclerView.Adapter<LawerViewHolder> {

    private ArrayList<Lawer> mData = null ;
    private Context context;

    public ItemLawerAdapter(ArrayList<Lawer> mData, Context context){
        this.mData = mData;
        this.context = context;
    }


    @NonNull
    @Override
    public LawerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lawer_home, parent, false);
        context = parent.getContext();
        LawerViewHolder holder = new LawerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LawerViewHolder holder, int position) {

        Glide.with(context).load(mData.get(position).getImg()).into(holder.img);
        holder.name.setText(mData.get(position).getName());
        holder.category.setText(mData.get(position).getCategory());
        holder.phone.setText(mData.get(position).getPhonNum());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
