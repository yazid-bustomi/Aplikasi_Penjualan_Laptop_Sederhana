package com.example.juallaptop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridLaptopAdapter extends RecyclerView.Adapter<GridLaptopAdapter.GridViewHolder> {

    private ArrayList<laptop> listLaptop;

    public GridLaptopAdapter(ArrayList<laptop>list){
        this.listLaptop = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int i) {
        Glide.with(holder.itemView.getContext())
                .load(listLaptop.get(i).getFotoLaptop())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgLaptop);
    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLaptop;

        GridViewHolder(View itemView){
            super(itemView);
            imgLaptop = itemView.findViewById(R.id.img_item_photo_grid);
        }
    }
}
