package com.example.easylaw.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easylaw.R;

import org.w3c.dom.Text;

public class LawerViewHolder extends RecyclerView.ViewHolder{
    public ImageView img;
    public TextView name;
    public TextView category;
    public TextView phone;



    public LawerViewHolder(@NonNull View itemView) {
        super(itemView);
        img = (ImageView)itemView.findViewById(R.id.cicleImg_lawer_item_lawer);
        name = (TextView)itemView.findViewById(R.id.txt_lawer_name_item_lawer);
        category = (TextView)itemView.findViewById(R.id.txt_lawer_category_item_lawer);
        phone = (TextView)itemView.findViewById(R.id.txt_phone_lawer_item);

    }
}
