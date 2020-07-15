package com.app.user.oneshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeActivity_2 extends AppCompatActivity {

    ArrayList images = new ArrayList<>(Arrays.asList(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.homeicon));
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_2);
    // get the reference of RecyclerView


    }
}
