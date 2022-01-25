package com.shia.practice110.fragments3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shia.practice110.R;
import com.shia.practice110.adapters3.ItemAdapter7;
import com.shia.practice110.items3.Item12;

import java.util.ArrayList;
import java.util.List;

public class FragmentFifteen extends Fragment {

    RecyclerView recyclerView;
    List<Item12> item12List = new ArrayList<>();
    ItemAdapter7 adapter7;

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
        return inflater.inflate(R.layout.fragment_fifteen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerView);

        adapter7 = new ItemAdapter7(item12List, getContext());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter7);

        //setData();

        super.onViewCreated(view, savedInstanceState);
    }

    /*private void setData() {

        item12List.add(new Item12(R.drawable.backpack1, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack2, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack3, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack4, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack5, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack6, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack7, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack8, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack9, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack10, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack11, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack12, "Mostafa"));
        item12List.add(new Item12(R.drawable.backpack13, "Mostafa"));

        adapter7.notifyDataSetChanged();
    }*/

}