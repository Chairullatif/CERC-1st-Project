package com.khoirullatif.cercjeniskucing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListCatAdapter extends RecyclerView.Adapter<ListCatAdapter.ListViewHolder> {

    private ArrayList<Cat> listCat;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListCatAdapter(ArrayList<Cat> listCat) {
        this.listCat = listCat;
    }

    @NonNull
    @Override
    public ListCatAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_cat, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListCatAdapter.ListViewHolder holder, int position) {
        Cat cat = listCat.get(position);
        holder.imgPhoto.setImageResource(cat.getImage());
        holder.tvName.setText(cat.getJenis());
        holder.tvHarga.setText(cat.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listCat.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCat.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Cat data);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHarga;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_image);
            tvName = itemView.findViewById(R.id.tv_jenis);
            tvHarga = itemView.findViewById(R.id.tv_harga);
        }
    }
}
