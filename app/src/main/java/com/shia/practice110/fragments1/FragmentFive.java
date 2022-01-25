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
import com.shia.practice110.adapters.CustomAdapter2;
import com.shia.practice110.items.Item2;

import java.util.ArrayList;

public class FragmentFive extends Fragment {

    ListView listView5;
    ArrayList<Item2> arrayList;

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
        return inflater.inflate(R.layout.fragment_five, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView5 = view.findViewById(R.id.listView5);

        arrayList = new ArrayList<>();

        CustomAdapter2 adapter2 = new CustomAdapter2(getContext(), arrayList);

        itemDetails();

        listView5.setAdapter(adapter2);

        super.onViewCreated(view, savedInstanceState);
    }

    private void itemDetails() {

        arrayList.add(new Item2("profile1", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile2", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile3", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile4", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile5", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile6", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile7", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile8", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile9", "Mostafa", "12:45", "hello friend"));
        arrayList.add(new Item2("profile10", "Mostafa", "12:45", "hello friend"));

    }
}