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
import com.shia.practice110.adapters.ContactAdapter;
import com.shia.practice110.items.Item4;

import java.util.ArrayList;
import java.util.List;

public class FragmentSeven extends Fragment {

    ListView listView7;
    List<Item4> item4List;
    ContactAdapter adapter;

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
        return inflater.inflate(R.layout.fragment_seven, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView7 = view.findViewById(R.id.listView7);

        item4List = new ArrayList<>();

        prepareData();

        refreshDisplay();

        super.onViewCreated(view, savedInstanceState);
    }

    private void prepareData() {

        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile1));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile2));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile3));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile4));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile5));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile6));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile7));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile8));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile9));
        item4List.add(new Item4("Mostafa", "09380476823", R.drawable.profile10));

    }

    private void refreshDisplay() {

        adapter = new ContactAdapter(getContext(), item4List);
        listView7.setAdapter(adapter);

    }
}