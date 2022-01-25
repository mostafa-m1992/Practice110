package com.shia.practice110;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.shia.practice110.fragments1.FragmentEight;
import com.shia.practice110.fragments1.FragmentFive;
import com.shia.practice110.fragments1.FragmentFour;
import com.shia.practice110.fragments1.FragmentOne;
import com.shia.practice110.fragments1.FragmentSeven;
import com.shia.practice110.fragments1.FragmentSix;
import com.shia.practice110.fragments1.FragmentThree;
import com.shia.practice110.fragments1.FragmentTwo;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    CoordinatorLayout coordinator;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinator = findViewById(R.id.coordinator);

        this.setTitle("Page1");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.item1:
                FragmentOne one = new FragmentOne();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.frameLayout, one);
                transaction.commit();
                break;
            case R.id.item2:
                FragmentTwo two = new FragmentTwo();
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                transaction1.replace(R.id.frameLayout, two);
                transaction1.commit();
                break;
            case R.id.item3:
                FragmentThree three = new FragmentThree();
                FragmentManager manager2 = getSupportFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                transaction2.replace(R.id.frameLayout, three);
                transaction2.commit();
                break;
            case R.id.item4:
                FragmentFour four = new FragmentFour();
                FragmentManager manager3 = getSupportFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                transaction3.replace(R.id.frameLayout, four);
                transaction3.commit();
                break;
            case R.id.item5:
                FragmentFive five = new FragmentFive();
                FragmentManager manager4 = getSupportFragmentManager();
                FragmentTransaction transaction4 = manager4.beginTransaction();
                transaction4.replace(R.id.frameLayout, five);
                transaction4.commit();
                break;
            case R.id.item6:
                FragmentSix six = new FragmentSix();
                FragmentManager manager5 = getSupportFragmentManager();
                FragmentTransaction transaction5 = manager5.beginTransaction();
                transaction5.replace(R.id.frameLayout, six);
                transaction5.commit();
                break;
            case R.id.item7:
                FragmentSeven seven = new FragmentSeven();
                FragmentManager manager6 = getSupportFragmentManager();
                FragmentTransaction transaction6 = manager6.beginTransaction();
                transaction6.replace(R.id.frameLayout, seven);
                transaction6.commit();
                break;
            case R.id.item8:
                FragmentEight eight = new FragmentEight();
                FragmentManager manager7 = getSupportFragmentManager();
                FragmentTransaction transaction7 = manager7.beginTransaction();
                transaction7.replace(R.id.frameLayout, eight);
                transaction7.commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int myId = item.getItemId();
        switch (myId) {
            case R.id.page1:
                startActivity(new Intent(this, MainActivity2.class));
                break;
            case R.id.page2:
                startActivity(new Intent(this, MainActivity3.class));
                break;
            case R.id.page3:
                startActivity(new Intent(this, MainActivity4.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}