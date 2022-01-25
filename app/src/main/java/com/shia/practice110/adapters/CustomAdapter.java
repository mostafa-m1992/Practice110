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
import com.shia.practice110.items.Item1;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Item1> item1s;

    public CustomAdapter(Context context, ArrayList<Item1> item1s) {
        this.context = context;
        this.item1s = item1s;
    }

    @Override
    public int getCount() {
        return item1s.size();
    }

    @Override
    public Object getItem(int i) {
        return item1s.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item2, viewGroup, false);
        }

        Item1 currentItem = (Item1) getItem(i);

        ImageView imgItemAvatar = view.findViewById(R.id.img_avatar);
        TextView txtItemName = view.findViewById(R.id.txt_name);
        TextView txtItemTime = view.findViewById(R.id.txt_time);
        TextView txtItemMessage = view.findViewById(R.id.txt_message);

        txtItemName.setText(currentItem.getTxtName());
        txtItemTime.setText(currentItem.getTxtData());
        txtItemMessage.setText(currentItem.getTxtMessage());

        String myUri = "@drawable/" + currentItem.getImgAvatar();
        int imageSource = context.getResources().getIdentifier(myUri, null, context.getPackageName());
        imgItemAvatar.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), imageSource, null));

        return view;
    }
}
