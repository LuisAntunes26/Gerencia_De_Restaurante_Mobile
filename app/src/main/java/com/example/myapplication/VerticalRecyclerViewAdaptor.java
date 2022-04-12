package com.example.myapplication;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerticalRecyclerViewAdaptor extends RecyclerView.Adapter<VerticalRecyclerViewAdaptor.VerticalRecyclerViewAdaptorViewHolder> {
    String[] categoryMenuData;
    int[] imagesData;
    Context context;
    public VerticalRecyclerViewAdaptor(Context ct, String[] categoryMenu, int[] images){
        context = ct;
        categoryMenuData = categoryMenu;
        imagesData = images;
    }

    @NonNull
    @Override
    public VerticalRecyclerViewAdaptorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.vertical_recyclerview_row, parent,false);
        return new VerticalRecyclerViewAdaptorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalRecyclerViewAdaptorViewHolder holder, int position) {
        holder.categoryMenu.setText(categoryMenuData[position]);
        holder.image.setImageResource(imagesData[position]);

    }

    @Override
    public int getItemCount() {
        return categoryMenuData.length;
    }

    public class VerticalRecyclerViewAdaptorViewHolder extends RecyclerView.ViewHolder{
        TextView categoryMenu;
        ImageView image;
        public VerticalRecyclerViewAdaptorViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryMenu = itemView.findViewById(R.id.categoryNameRecyclerView);
            image = itemView.findViewById(R.id.imageViewRecyclerView);
        }
    }
}
