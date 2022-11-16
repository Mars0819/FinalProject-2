package com.example.finalproject2.Products;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class ComputerAdapter extends RecyclerView.Adapter<ComputerAdapter.ViewRecHolder> {

    private ComputerModel[] listData;
    private Context mcontext;

    public ComputerAdapter(ComputerModel[] listData, Context mcontext) {
        this.listData = listData;
        this.mcontext = mcontext;
    }


    @NonNull
    @Override
    public ViewRecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).
                inflate(R.layout.list_item_computer,parent,false);
        return new ViewRecHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRecHolder holder, int position) {
        final ComputerModel computerModel = listData[position];
        holder.tvNamaItem.setText(listData[position].getTvNamaItem());
        holder.tvHarga.setText(listData[position].getTvHarga());
        holder.imgItem.setImageResource(listData[position].getImgItem());
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewRecHolder extends RecyclerView.ViewHolder {
        public ImageView imgItem;
        public TextView tvNamaItem,tvHarga;

        public ViewRecHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            tvNamaItem = itemView.findViewById(R.id.tvNamaItem);
            tvHarga = itemView.findViewById(R.id.tvHarga);

        }
    }
}

