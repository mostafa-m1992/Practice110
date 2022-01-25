package com.shia.practice110.adapters2;

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
import com.shia.practice110.items2.Item6;

import java.util.List;

public class ItemAdapter1 extends RecyclerView.Adapter<ItemAdapter1.MyViewHolder> {

    List<Item6> item6s;
    Context context;

    public ItemAdapter1(List<Item6> item6s, Context context) {
        this.item6s = item6s;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item6, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item6 item6 = item6s.get(position);

        holder.holderAvatar.setImageResource(item6.getUserAvatar());
        holder.holderName.setText(item6.getUserName());
        holder.holderMessage.setText(item6.getUserMessage());
        holder.holderTime.setText(item6.getUserTime());

        holder.holderItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return item6s.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView holderAvatar;
        public TextView holderName;
        public TextView holderMessage;
        public TextView holderTime;
        public LinearLayout holderItem;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            holderAvatar = itemView.findViewById(R.id.imgAvatar);
            holderName = itemView.findViewById(R.id.textName);
            holderMessage = itemView.findViewById(R.id.textMessage);
            holderTime = itemView.findViewById(R.id.textTime);
            holderItem = itemView.findViewById(R.id.itemLayout);

        }
    }
}
