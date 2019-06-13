package com.tms.androidfragments4;

import android.net.Uri;
import android.support.annotation.FractionRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements Fragment_Favorites.OnFragmentInteractionListener, Fragment_Home.OnFragmentInteractionListener, Fragment_Search.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Fragment_Home())
                .commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
        new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;

                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new Fragment_Home();
                        break;
                    case R.id.nav_favorites:
                        selectedFragment = new Fragment_Favorites();
                        break;
                    case R.id.nav_search:
                        selectedFragment = new Fragment_Search();
                        break;
                    default:
                        break;
                }

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, selectedFragment)
                        .commit();

                return true;
            }
        };

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
