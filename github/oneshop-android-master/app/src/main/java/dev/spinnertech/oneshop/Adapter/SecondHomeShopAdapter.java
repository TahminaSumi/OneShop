package dev.spinnertech.oneshop.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import dev.spinnertech.oneshop.R;

/**
 * Created by USER on 18-Jul-20.
 */

public class SecondHomeShopAdapter extends RecyclerView.Adapter<SecondHomeShopAdapter.ViewHolder> {

    private int[] mData;
    private LayoutInflater mInflater;

    public SecondHomeShopAdapter(Context context, int[] data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.secondhome_shop_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(mData[position]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
   //     public CardView container;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView_shop);
    //        container = itemView.findViewById(R.id.cardview_product_container);

        }
    }
}
