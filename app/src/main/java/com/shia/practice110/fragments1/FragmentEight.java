package com.shia.practice110.fragments1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.shia.practice110.R;
import com.shia.practice110.adapters.ContactAdapter2;
import com.shia.practice110.items.Item5;

import java.util.ArrayList;
import java.util.List;

public class FragmentEight extends Fragment {

    ListView listView8;
    List<Item5> item5List;
    ContactAdapter2 adapter2;

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
        return inflater.inflate(R.layout.fragment_eight, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView8 = view.findViewById(R.id.listView8);

        item5List = new ArrayList<>();

        prepareData();

        refreshDisplay();

        super.onViewCreated(view, savedInstanceState);
    }

    private void prepareData() {
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile1));
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile2));
        addFakeItem(2);
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile3));
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile4));
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile5));
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile6));
        addFakeItem(2);
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile7));
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile8));
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile9));
        addFakeItem(2);
        item5List.add(new Item5("Mostafa", "09380476823", R.drawable.profile10));
    }

    private void refreshDisplay() {
        adapter2 = new ContactAdapter2(getContext(), item5List);
        listView8.setAdapter(adapter2);
    }

    private void addFakeItem(int number) {
        for (int i = 0 ; i < number ; i++) {
            item5List.add(new Item5("Hasan", "09380476823", R.drawable.funnyicon));
        }
    }
}