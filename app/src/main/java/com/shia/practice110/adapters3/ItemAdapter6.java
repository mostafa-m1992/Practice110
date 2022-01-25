package com.shia.practice110.adapters3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shia.practice110.R;
import com.shia.practice110.items3.Item11;

import java.util.List;

public class ItemAdapter6 extends RecyclerView.Adapter<ItemAdapter6.MyViewHolder> {

    List<Item11> item11s;
    Context context;

    public ItemAdapter6(List<Item11> item11s, Context context) {
        this.item11s = item11s;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item11, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item11 item11 = item11s.get(position);

        holder.holderImage.setImageResource(item11.getProductImage());
        holder.holderName.setText(item11.getProductName());
        holder.holderDetail.setText(item11.getProductMessage());
        holder.holderPrice.setText(item11.getProductDetail());

        holder.holderItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getPosition()) {
                    case 0:
                        Toast.makeText(context, "Item 0", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(context, "Item 1", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(context, "Item 2", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(context, "Item 3", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(context, "Item 4", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(context, "Item 5", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(context, "Item 6", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(context, "Item 7", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(context, "Item 8", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(context, "Item 9", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return item11s.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView holderImage;
        public TextView holderName;
        public TextView holderDetail;
        public TextView holderPrice;
        public LinearLayout holderItem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            holderImage = itemView.findViewById(R.id.productImage);
            holderName = itemView.findViewById(R.id.productName);
            holderDetail = itemView.findViewById(R.id.productDetail);
            holderPrice = itemView.findViewById(R.id.productPrice);
            holderItem = itemView.findViewById(R.id.itemLayout);

        }
    }
}
