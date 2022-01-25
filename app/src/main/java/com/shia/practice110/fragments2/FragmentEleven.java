package com.shia.practice110.fragments2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shia.practice110.R;
import com.shia.practice110.adapters2.ItemAdapter3;
import com.shia.practice110.items2.Item7;
import com.shia.practice110.items2.Item8;

import java.util.ArrayList;
import java.util.List;

public class FragmentEleven extends Fragment {

    RecyclerView recyclerView;
    List<Item8> item8List = new ArrayList<>();
    ItemAdapter3 adapter3;

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
        return inflater.inflate(R.layout.fragment_eleven, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerView);

        adapter3 = new ItemAdapter3(item8List, getContext());

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.HORIZONTAL);
        recyclerView.addItemDecoration(itemDecoration);

        RecyclerView.ItemDecoration itemDecoration2 = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration2);

        recyclerView.setAdapter(adapter3);

        setData();

        super.onViewCreated(view, savedInstanceState);
    }

    private void setData() {

        item8List.add(new Item8(R.drawable.phone1, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone2, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone3, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone4, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone5, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone6, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone7, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone8, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone9, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone10, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone11, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone12, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone13, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone14, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone15, "Samsung", "this is an example for Galaxy", "12000000"));
        item8List.add(new Item8(R.drawable.phone16, "Samsung", "this is an example for Galaxy", "12000000"));


        adapter3.notifyDataSetChanged();

    }
}