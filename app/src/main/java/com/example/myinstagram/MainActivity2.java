package com.example.myinstagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {

    BottomNavigationView bottomnav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomnav = findViewById(R.id.nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragments, new HomeFragment()).commit();


        bottomnav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragments, new HomeFragment()).commit();
                        break;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragments, new SearchFragment()).commit();
                        break;
                    case R.id.person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragments, new PersonFragment()).commit();
                        break;
                }
                return true;
            }
        });

    }
}