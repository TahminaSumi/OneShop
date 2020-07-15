package com.app.user.oneshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.app.user.oneshop.Adapter.SecondHomeAdapter;

public class SecondHomeActivity extends AppCompatActivity {


    RecyclerView recyclerview;
    RecyclerView.LayoutManager layoutManager;
    SecondHomeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        int[] data = {R.drawable.a,R.drawable.b,R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.a,R.drawable.d,
                R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,
                R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,};

        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNumbers);
        int numberOfColumns = 4;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new SecondHomeAdapter(this, data);

        recyclerView.setAdapter(adapter);

    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);

        MenuItem searchItem= menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView)searchItem.getActionView();
        return true;
    }
*/

}
