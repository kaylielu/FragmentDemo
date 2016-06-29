package com.example.kaylie.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Roles of the Activity
//1. Navigation between activities and fragments
//2. Communications between fragments
//3. Adding and removing the fragments on the screen
//4. ActionBar

public class MainActivity extends AppCompatActivity {

    OneFragment oneFragment;
    TwoFragment twoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
    }

    public void onOneClick(View view) {
        // 1. Get the support fragment manager
        FragmentManager fm = getSupportFragmentManager();

        // 2. Create a transaction
        FragmentTransaction ft = fm.beginTransaction();

        // 3. Add or remove the fragment
        ft.replace(R.id.flContainer, oneFragment);
        ft.addToBackStack("one");

        // 4. Commit the transaction
        ft.commit();

    }

    public void onTwoClick(View view) {
        // 1. Get the support fragment manager
        FragmentManager fm = getSupportFragmentManager();

        // 2. Create a transaction
        FragmentTransaction ft = fm.beginTransaction();

        // 3. Add or remove the fragment
        ft.replace(R.id.flContainer, twoFragment);
        ft.addToBackStack("two");

        // 4. Commit the transaction
        ft.commit();

    }
}
