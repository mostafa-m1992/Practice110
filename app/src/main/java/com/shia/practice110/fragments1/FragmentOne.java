package com.shia.practice110.fragments1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ListAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.shia.practice110.R;

public class FragmentOne extends Fragment {

    ListView listView1;
    String[] mobileBrands;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView1 = view.findViewById(R.id.listView1);
        mobileBrands = new String[] {"LG", "SAMSUNG", "APPLE", "SONY", "HUAWEI", "HTC", "ACER", "ACER", "SONY", "APPLE", "HTC"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, mobileBrands);
        listView1.setAdapter(adapter);

        super.onViewCreated(view, savedInstanceState);
    }
}