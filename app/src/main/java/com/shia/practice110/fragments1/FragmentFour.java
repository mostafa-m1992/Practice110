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
import com.shia.practice110.adapters.CustomAdapter;
import com.shia.practice110.items.Item1;

import java.util.ArrayList;

public class FragmentFour extends Fragment {

    ListView listView4;
    ArrayList<Item1> arrayItem;

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
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        listView4 = view.findViewById(R.id.listView4);

        arrayItem = new ArrayList<>();

        CustomAdapter adapter = new CustomAdapter(getContext(), arrayItem);

        arrayItem.add(new Item1("profile1", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile2", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile3", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile4", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile5", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile6", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile7", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile8", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile9", "Mostafa", "12:45", "hello friend"));
        arrayItem.add(new Item1("profile10", "Mostafa", "12:45", "hello friend"));

        listView4.setAdapter(adapter);

        super.onViewCreated(view, savedInstanceState);
    }
}