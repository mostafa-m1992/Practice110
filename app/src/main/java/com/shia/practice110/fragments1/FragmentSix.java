package com.shia.practice110.fragments1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.shia.practice110.R;
import com.shia.practice110.items.Item3;

import java.util.ArrayList;
import java.util.List;

public class FragmentSix extends Fragment {

    ListView listView6;
    List<Item3> item3s;
    ArrayAdapter<Item3> adapter;

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
        return inflater.inflate(R.layout.fragment_six, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView6 = view.findViewById(R.id.listView6);

        item3s = new ArrayList<>();

        prepareData();

        refreshDisplay();

        super.onViewCreated(view, savedInstanceState);
    }

    private void prepareData() {

        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile1));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile2));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile3));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile4));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile5));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile6));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile7));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile8));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile9));
        item3s.add(new Item3("Mostafa", "09380476823", R.drawable.profile10));

    }

    private void refreshDisplay() {

        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_expandable_list_item_1, item3s);
        listView6.setAdapter(adapter);
    }
}