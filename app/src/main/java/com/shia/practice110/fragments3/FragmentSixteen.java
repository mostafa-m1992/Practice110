package com.shia.practice110.fragments3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shia.practice110.R;
import com.shia.practice110.adapters3.ItemAdapter8;
import com.shia.practice110.items3.Item13;

import java.util.List;


public class FragmentSixteen extends Fragment {

    RecyclerView recyclerView;
    List<Item13> item13List;
    ItemAdapter8 adapter8;

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
        return inflater.inflate(R.layout.fragment_sixteen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerView);

        adapter8 = new ItemAdapter8(item13List, getContext());

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter8);

        //setData();

        super.onViewCreated(view, savedInstanceState);
    }

    /*private void setData() {

        item13List.add(new Item13(R.drawable.backpack1, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack2, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack3, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack4, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack5, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack6, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack7, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack8, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack9, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack10, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack11, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack12, "Mostafa"));
        item13List.add(new Item13(R.drawable.backpack13, "Mostafa"));

        adapter8.notifyDataSetChanged();
    }*/

}