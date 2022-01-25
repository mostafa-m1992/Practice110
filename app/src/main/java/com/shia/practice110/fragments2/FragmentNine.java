package com.shia.practice110.fragments2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shia.practice110.R;
import com.shia.practice110.adapters2.ItemAdapter1;
import com.shia.practice110.items2.Item6;

import java.util.ArrayList;
import java.util.List;

public class FragmentNine extends Fragment {

    RecyclerView recyclerView;
    List<Item6> item6List = new ArrayList<>();
    ItemAdapter1 adapter1;

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
        return inflater.inflate(R.layout.fragment_nine, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerView);

        adapter1 = new ItemAdapter1(item6List, getContext());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter1);

        setData();

        super.onViewCreated(view, savedInstanceState);
    }

    private void setData() {

        item6List.add(new Item6(R.drawable.profile1, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile2, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile3, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile4, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile5, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile6, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile7, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile8, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile9, "Mostafa Merati", "Hello friend", "12:45"));
        item6List.add(new Item6(R.drawable.profile10, "Mostafa Merati", "Hello friend", "12:45"));

        adapter1.notifyDataSetChanged();
    }
}