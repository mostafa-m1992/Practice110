package com.shia.practice110;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    ListView listView1;
    List<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView1 = findViewById(R.id.listView1);

        items = new ArrayList<>();
        prepareData();

        refreshDisplay();
    }

    private void prepareData() {

        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");
        items.add("Tehran");

    }

    private void refreshDisplay() {

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(), items.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("AddItem").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                items.add("new item");
                adapter.notifyDataSetChanged();
                return false;
            }
        });

        menu.add("removeItem").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (items.isEmpty())
                    return false;
                items.remove(items.size()-1);
                adapter.notifyDataSetChanged();
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            //finish();
        }
        return super.onOptionsItemSelected(item);
    }
}