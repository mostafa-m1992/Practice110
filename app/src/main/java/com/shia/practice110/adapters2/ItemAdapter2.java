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
import com.shia.practice110.items2.Item7;

import java.util.List;

public class ItemAdapter2 extends RecyclerView.Adapter<ItemAdapter2.MyViewHolder> {

    List<Item7> item7s;
    Context context;

    public ItemAdapter2(List<Item7> item7s, Context context) {
        this.item7s = item7s;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item7, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item7 item7 = item7s.get(position);

        holder.holderImage.setImageResource(item7.getProductImage());
        holder.holderName.setText(item7.getProductName());
        holder.holderDetail.setText(item7.getProductMessage());
        holder.holderPrice.setText(item7.getProductPrice());

    }

    @Override
    public int getItemCount() {
        return item7s.size();
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
