package com.shia.practice110.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.shia.practice110.R;
import com.shia.practice110.items.Item5;

import java.util.List;

public class ContactAdapter2 extends ArrayAdapter {

    List<Item5> item5s;


    public ContactAdapter2(@NonNull Context context, List<Item5> item5s) {
        super(context, R.layout.list_item5, item5s);
        this.item5s = item5s;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Item5 item5 = item5s.get(position);

        ViewHolder holder;

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item5, parent, false);

            holder = new ViewHolder();

            holder.imageView = convertView.findViewById(R.id.mycontact_pimg);
            holder.textName = convertView.findViewById(R.id.mycontact_name);
            holder.textPhone = convertView.findViewById(R.id.mycontact_phone);
            holder.icCall = convertView.findViewById(R.id.mycontact_iccall);
            holder.icSms = convertView.findViewById(R.id.mycontact_icsms);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.fill(item5);
        return convertView;
    }

    private class ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView textName;
        public TextView textPhone;
        public ImageView icSms, icCall;

        public void fill(Item5 item5) {
            imageView.setImageResource(item5.getId());
            textName.setText(item5.getName());
            textPhone.setText(item5.getPhoneNumber());

            icCall.setTag(item5.getPhoneNumber());
            icSms.setTag(item5.getPhoneNumber());

            icCall.setOnClickListener(this);
            icSms.setOnClickListener(this::onClick);
        }

        @Override
        public void onClick(View view) {
            String phone = (String) view.getTag();
            Intent intent = new Intent(Intent.ACTION_VIEW);

            if (view.equals(icCall)) {
                intent.setData(Uri.parse("tel: " + phone));
                getContext().startActivity(intent);
            } else if (view.equals(icSms)) {
                intent.setData(Uri.parse("sms: " + phone));
                getContext().startActivity(intent);
            }
        }
    }
}
