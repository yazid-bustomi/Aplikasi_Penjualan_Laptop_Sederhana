package com.example.juallaptop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLaptopAdapter extends RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder> {
    private ArrayList<laptop> listLaptop;

    public ListLaptopAdapter(ArrayList<laptop>list) {
        this.listLaptop = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_laptop, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        laptop laptop = listLaptop.get(position);
        Glide.with(holder.itemView.getContext())
                .load(laptop.getFotoLaptop())
                .apply(new RequestOptions().override(130, 140))
                .into(holder.imgLaptop);
        holder.tvName.setText(laptop.getNamaLaptop());
        holder.tvDetail.setText(laptop.getDetailLaptop());
    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        ImageView imgLaptop;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLaptop = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
