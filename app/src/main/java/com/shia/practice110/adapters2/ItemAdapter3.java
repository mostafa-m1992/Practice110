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
import com.shia.practice110.items2.Item8;

import java.util.List;

public class ItemAdapter3 extends RecyclerView.Adapter<ItemAdapter3.MyViewHolder> {

    List<Item8> item8s;
    Context context;

    public ItemAdapter3(List<Item8> item8s, Context context) {
        this.item8s = item8s;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item8, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item8 item8 = item8s.get(position);

        holder.holderImage.setImageResource(item8.getProductImage());
        holder.holderName.setText(item8.getProductName());
        holder.holderDetail.setText(item8.getProductDetail());
        holder.holderPrice.setText(item8.getProductPrice());

    }

    @Override
    public int getItemCount() {
        return item8s.size();
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
