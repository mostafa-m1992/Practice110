package com.shia.practice110.adapters2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shia.practice110.R;
import com.shia.practice110.items2.Item9;

import java.util.List;

public class ItemAdapter4 extends RecyclerView.Adapter<ItemAdapter4.MyViewHolder> {

    List<Item9> item9s;
    Context context;

    public ItemAdapter4(List<Item9> item9s, Context context) {
        this.item9s = item9s;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item9, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item9 item9 = item9s.get(position);

        holder.holderImage.setImageResource(item9.getProductImage());
        holder.holderName.setText(item9.getProductName());
        holder.holderDetail.setText(item9.getProductDetail());
        holder.holderPrice.setText(item9.getProductPrice());

    }

    @Override
    public int getItemCount() {
        return item9s.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView holderImage;
        private TextView holderName;
        private TextView holderDetail;
        private TextView holderPrice;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            holderImage = itemView.findViewById(R.id.productImage);
            holderName = itemView.findViewById(R.id.productName);
            holderDetail = itemView.findViewById(R.id.productDetail);
            holderPrice = itemView.findViewById(R.id.productPrice);
        }
    }
}
