package com.shia.practice110.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.shia.practice110.R;
import com.shia.practice110.items.Item4;

import java.util.List;

public class ContactAdapter extends ArrayAdapter {

    List<Item4> item4s;

    public ContactAdapter(@NonNull Context context, List<Item4> item4s) {
        super(context, R.layout.list_item4, item4s);
        this.item4s = item4s;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Item4 item4 = item4s.get(position);

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item4, parent, false);

        ImageView imageView = view.findViewById(R.id.mycontact_pimg);
        TextView textName = view.findViewById(R.id.mycontact_name);
        TextView textPhone = view.findViewById(R.id.mycontact_phone);

        if (item4.getId() != 0) {
            imageView.setImageResource(item4.getId());
        }

        textName.setText(item4.getName());
        textPhone.setText(item4.getPhoneNumber());

        return view;
    }
}
