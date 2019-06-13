package com.tms.androidfragments4;

import android.net.Uri;
import android.support.annotation.FractionRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment_Favorites.OnFragmentInteractionListener, Fragment_Home.OnFragmentInteractionListener, Fragment_Search.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
