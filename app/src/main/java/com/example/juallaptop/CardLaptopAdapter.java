package com.example.juallaptop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardLaptopAdapter extends RecyclerView.Adapter<CardLaptopAdapter.CardViewHolder> {

    private ArrayList<laptop>listLaptop;

    public CardLaptopAdapter(ArrayList<laptop> list){
        this.listLaptop = list;
    }



    @NonNull
    @Override
    public CardLaptopAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        laptop laptop = listLaptop.get(position);

        Glide.with(holder.itemView.getContext())
                .load(laptop.getFotoLaptop())
                .apply(new RequestOptions().override(250,260))
                .into(holder.imgPhoto);
        holder.tvName.setText(laptop.getNamaLaptop());
        holder.tvDetail.setText(laptop.getDetailLaptop());

//        holder.btnBuy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), "Beli" + listLaptop.get(holder.getAdapterPosition()).getNamaLaptop(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        holder.btnShare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu Memilih " + listLaptop.get(holder.getAdapterPosition()).getNamaLaptop(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnBuy, btnShare;

        CardViewHolder(View view){
            super(view);
            imgPhoto = view.findViewById(R.id.img_item_photo_card);
            tvName = view.findViewById(R.id.tv_item_name_card);
            tvDetail = view.findViewById(R.id.tv_item_detail_card);
            btnBuy = view.findViewById(R.id.btn_buy);
            btnShare = view.findViewById(R.id.btn_share);

        }
    }
}
