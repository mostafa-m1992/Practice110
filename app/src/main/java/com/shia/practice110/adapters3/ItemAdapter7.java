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
import com.shia.practice110.items3.Item12;

import java.util.List;

public class ItemAdapter7 extends RecyclerView.Adapter<ItemAdapter7.MyViewHolder> {

    List<Item12> item12s;
    Context context;

    public ItemAdapter7(List<Item12> item12s, Context context) {
        this.item12s = item12s;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item12, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item12 item12 = item12s.get(position);

        holder.holderImage.setImageResource(item12.getProductImage());
        holder.holderName.setText(item12.getProductName());

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
        return item12s.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView holderImage;
        public TextView holderName;
        public LinearLayout holderItem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            holderImage = itemView.findViewById(R.id.productImage);
            holderName = itemView.findViewById(R.id.productName);
            holderItem = itemView.findViewById(R.id.itemLayout);
        }
    }
}
