package com.shia.practice110.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.shia.practice110.R;
import com.shia.practice110.items.Item2;

import java.util.ArrayList;

public class CustomAdapter2 extends BaseAdapter {

    private Context context;
    private ArrayList<Item2> item2s;

    public CustomAdapter2(Context context, ArrayList<Item2> item2s) {
        this.context = context;
        this.item2s = item2s;
    }

    @Override
    public int getCount() {
        return item2s.size();
    }

    @Override
    public Object getItem(int i) {
        return item2s.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder{
        TextView txtItemName;
        TextView txtItemTime;
        TextView txtItemMessage;
        ImageView imgItemAvatar;

        public ViewHolder(View view) {
            txtItemName = view.findViewById(R.id.txt_name);
            txtItemTime = view.findViewById(R.id.txt_time);
            txtItemMessage = view.findViewById(R.id.txt_message);
            imgItemAvatar = view.findViewById(R.id.img_avatar);
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item3, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Item2 currentItem = (Item2) getItem(i);

        viewHolder.txtItemName.setText(currentItem.getTxtName());
        viewHolder.txtItemTime.setText(currentItem.getTxtTime());
        viewHolder.txtItemMessage.setText(currentItem.getTxtMessage());

        String myUri = "@drawable/" + currentItem.getImgAvatar();
        int imageSource = context.getResources().getIdentifier(myUri, null, context.getPackageName());
        viewHolder.imgItemAvatar.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), imageSource, null));

        return view;
    }
}
