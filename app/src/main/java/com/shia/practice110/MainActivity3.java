package com.shia.practice110;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailView;
import com.shia.practice110.fragments2.FragmentEleven;
import com.shia.practice110.fragments2.FragmentNine;
import com.shia.practice110.fragments2.FragmentTen;
import com.shia.practice110.fragments2.FragmentThirteen;
import com.shia.practice110.fragments2.FragmentTwelve;

public class MainActivity3 extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    NavigationRailView navigationRailView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        coordinatorLayout = findViewById(R.id.coordinatorLayout);

        this.setTitle("Page2");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationRailView = findViewById(R.id.navigationRailView);

        setNavigationRailView(navigationRailView);

        /*navigationRailView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int myItemId = item.getItemId();

                switch (myItemId) {
                    case R.id.list1:
                        FragmentNine nine = new FragmentNine();
                        FragmentManager manager = getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.frameLayout, nine);
                        transaction.commit();
                        break;
                    case R.id.list2:
                        FragmentTen ten = new FragmentTen();
                        FragmentManager manager1 = getSupportFragmentManager();
                        FragmentTransaction transaction1 = manager1.beginTransaction();
                        transaction1.replace(R.id.frameLayout, ten);
                        transaction1.commit();
                        break;
                    case R.id.list3:
                        FragmentEleven eleven = new FragmentEleven();
                        FragmentManager manager2 = getSupportFragmentManager();
                        FragmentTransaction transaction2 = manager2.beginTransaction();
                        transaction2.replace(R.id.frameLayout, eleven);
                        transaction2.commit();
                        break;
                    case R.id.list4:
                        FragmentTwelve twelve = new FragmentTwelve();
                        FragmentManager manager3 = getSupportFragmentManager();
                        FragmentTransaction transaction3 = manager3.beginTransaction();
                        transaction3.replace(R.id.frameLayout, twelve);
                        transaction3.commit();
                        break;
                    case R.id.list5:
                        FragmentThirteen thirteen = new FragmentThirteen();
                        FragmentManager manager4 = getSupportFragmentManager();
                        FragmentTransaction transaction4 = manager4.beginTransaction();
                        transaction4.replace(R.id.frameLayout, thirteen);
                        transaction4.commit();
                        break;
                }

                return true;
            }
        });*/

        /*navigationRailView.setOnItemSelectedListener(this);*/
    }

    //@Override
    /*public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int myItemId = item.getItemId();

        switch (myItemId) {
            case R.id.list1:
                FragmentNine nine = new FragmentNine();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.frameLayout, nine);
                transaction.commit();
                break;
            case R.id.list2:
                FragmentTen ten = new FragmentTen();
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                transaction1.replace(R.id.frameLayout, ten);
                transaction1.commit();
                break;
            case R.id.list3:
                FragmentEleven eleven = new FragmentEleven();
                FragmentManager manager2 = getSupportFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                transaction2.replace(R.id.frameLayout, eleven);
                transaction2.commit();
                break;
            case R.id.list4:
                FragmentTwelve twelve = new FragmentTwelve();
                FragmentManager manager3 = getSupportFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                transaction3.replace(R.id.frameLayout, twelve);
                transaction3.commit();
                break;
            case R.id.list5:
                FragmentThirteen thirteen = new FragmentThirteen();
                FragmentManager manager4 = getSupportFragmentManager();
                FragmentTransaction transaction4 = manager4.beginTransaction();
                transaction4.replace(R.id.frameLayout, thirteen);
                transaction4.commit();
                break;
        }

        return true;
    }*/

    //@Override
    /*public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int myItemId = item.getItemId();

        switch (myItemId) {
            case R.id.list1:
                FragmentNine nine = new FragmentNine();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.frameLayout, nine);
                transaction.commit();
                break;
            case R.id.list2:
                FragmentTen ten = new FragmentTen();
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                transaction1.replace(R.id.frameLayout, ten);
                transaction1.commit();
                break;
            case R.id.list3:
                FragmentEleven eleven = new FragmentEleven();
                FragmentManager manager2 = getSupportFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                transaction2.replace(R.id.frameLayout, eleven);
                transaction2.commit();
                break;
            case R.id.list4:
                FragmentTwelve twelve = new FragmentTwelve();
                FragmentManager manager3 = getSupportFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                transaction3.replace(R.id.frameLayout, twelve);
                transaction3.commit();
                break;
            case R.id.list5:
                FragmentThirteen thirteen = new FragmentThirteen();
                FragmentManager manager4 = getSupportFragmentManager();
                FragmentTransaction transaction4 = manager4.beginTransaction();
                transaction4.replace(R.id.frameLayout, thirteen);
                transaction4.commit();
                break;
        }

        navigationRailView = findViewById(R.id.navigationView);

        return true;
    }*/

    public void setNavigationRailView(NavigationRailView navigationRailView) {
        this.navigationRailView = navigationRailView;
        navigationRailView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int myItemId = item.getItemId();

                switch (myItemId) {
                    case R.id.list1:
                        FragmentNine nine = new FragmentNine();
                        FragmentManager manager = getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.frameLayout, nine);
                        transaction.commit();
                        break;
                    case R.id.list2:
                        FragmentTen ten = new FragmentTen();
                        FragmentManager manager1 = getSupportFragmentManager();
                        FragmentTransaction transaction1 = manager1.beginTransaction();
                        transaction1.replace(R.id.frameLayout, ten);
                        transaction1.commit();
                        break;
                    case R.id.list3:
                        FragmentEleven eleven = new FragmentEleven();
                        FragmentManager manager2 = getSupportFragmentManager();
                        FragmentTransaction transaction2 = manager2.beginTransaction();
                        transaction2.replace(R.id.frameLayout, eleven);
                        transaction2.commit();
                        break;
                    case R.id.list4:
                        FragmentTwelve twelve = new FragmentTwelve();
                        FragmentManager manager3 = getSupportFragmentManager();
                        FragmentTransaction transaction3 = manager3.beginTransaction();
                        transaction3.replace(R.id.frameLayout, twelve);
                        transaction3.commit();
                        break;
                    case R.id.list5:
                        FragmentThirteen thirteen = new FragmentThirteen();
                        FragmentManager manager4 = getSupportFragmentManager();
                        FragmentTransaction transaction4 = manager4.beginTransaction();
                        transaction4.replace(R.id.frameLayout, thirteen);
                        transaction4.commit();
                        break;
                }

                return true;
            }
        });
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