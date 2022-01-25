package com.shia.practice110.fragments1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.shia.practice110.R;

public class FragmentTwo extends Fragment {

    ListView listView2;
    String[] mobile;

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
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        listView2 = view.findViewById(R.id.listView2);
        mobile = new String[] {"LG", "SAMSUNG", "APPLE", "SONY", "HUAWEI", "HTC", "ACER", "ACER", "SONY", "APPLE", "HTC"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), R.layout.list_item, R.id.tv, mobile);
        listView2.setAdapter(adapter);

        super.onViewCreated(view, savedInstanceState);
    }
}