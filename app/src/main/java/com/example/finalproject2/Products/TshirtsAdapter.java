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

public class TshirtsAdapter extends RecyclerView.Adapter<TshirtsAdapter.ViewRecHolder> {

    private TshirtsModel[] listData;
    private Context mcontext;

    public TshirtsAdapter(TshirtsModel[] listData, Context mcontext) {
        this.listData = listData;
        this.mcontext = mcontext;
    }


    @NonNull
    @Override
    public ViewRecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).
                inflate(R.layout.list_item_tshirts,parent,false);
        return new ViewRecHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRecHolder holder, int position) {
        final TshirtsModel tshirtsModel = listData[position];
       // holder.imgItem.setImageResource(listData[position].getImgItem());
        //Picasso.get().load(https://firebasestorage.googleapis.com/v0/b/finpro2-48f9f.appspot.com/o/pocket%20shirt.jpg?alt=media&token=2fddb346-599f-4e5c-9a92-368cfabed3cb)
       // into.(holder.imgItem)
        holder.tvNamaItem.setText(listData[position].getTvNamaItem());
        holder.tvHarga.setText(listData[position].getTvHarga());
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
