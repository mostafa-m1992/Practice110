package com.shia.practice110.fragments2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shia.practice110.R;
import com.shia.practice110.adapters2.ItemAdapter5;
import com.shia.practice110.items2.Item10;
import com.shia.practice110.items2.Item9;

import java.util.ArrayList;
import java.util.List;

public class FragmentThirteen extends Fragment {

    RecyclerView recyclerView;
    List<Item10> item10List = new ArrayList<>();
    ItemAdapter5 adapter5;

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
        return inflater.inflate(R.layout.fragment_thirteen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerView);

        adapter5 = new ItemAdapter5(item10List, getContext());

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        RecyclerView.ItemDecoration itemDecoration2 = new DividerItemDecoration(getContext(), DividerItemDecoration.HORIZONTAL);
        recyclerView.addItemDecoration(itemDecoration2);

        recyclerView.setAdapter(adapter5);

        setData();

        super.onViewCreated(view, savedInstanceState);
    }

    private void setData() {

        item10List.add(new Item10(R.drawable.phone1, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone2, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone3, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone4, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone5, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone6, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone7, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone8, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone9, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone10, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone11, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone12, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone13, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone14, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone15, "Samsung", "this is an example for Galaxy", "12000000"));
        item10List.add(new Item10(R.drawable.phone16, "Samsung", "this is an example for Galaxy", "12000000"));

        adapter5.notifyDataSetChanged();

    }
}