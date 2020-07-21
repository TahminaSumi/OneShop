package dev.spinnertech.oneshop;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dev.spinnertech.oneshop.Adapter.RecentProductAdapter;
import dev.spinnertech.oneshop.Adapter.SecondHomeShopAdapter;

public class SecondHomeActivity extends AppCompatActivity {

    private RecyclerView rv_recent_product,rv_shop;
    private RecentProductAdapter secondHomeAdapter;
    private SecondHomeShopAdapter rv_secondhome_shop;
    TextView shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_home);


        int[] data = {R.drawable.fashion_for_men,R.drawable.fashion_for_women,R.drawable.books,
                        R.drawable.beuty_and_care,R.drawable.kids,R.drawable.food,R.drawable.electronics};



        //RECENT PRODUCT RECYCLERVIEW
        rv_recent_product = (RecyclerView) findViewById(R.id.recyclerview_recent_product);
        rv_recent_product.setHasFixedSize(true);
 /*     recyclerViewVertical.setLayoutManager(new GridLayoutManager(this,2));
        recyclerViewVertical.setAdapter(new SeconHomeAdapter(this,data)); */
        rv_recent_product.setLayoutManager(new GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false));
        rv_recent_product.setAdapter(new RecentProductAdapter(this,data));


        //SHOP RECYCLERVIEW
        rv_shop = (RecyclerView) findViewById(R.id.rv_secondhome_shop);
        rv_shop.setHasFixedSize(true);
        rv_shop.setLayoutManager(new GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false));
        rv_shop.setAdapter(new SecondHomeShopAdapter(this,data));




    }


}
