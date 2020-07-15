package com.app.user.oneshop.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.user.oneshop.R;

/**
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.app.user.oneshop.R;

import static com.app.user.oneshop.R.*;


 * Created by USER on 13-Jul-20.
*/

public class SecondHomeAdapter extends RecyclerView.Adapter<SecondHomeAdapter.ViewHolder> {

    private int[] mData;
    private LayoutInflater mInflater;
    //  private ItemClickListener mClickListener;

    // data is passed into the constructor
    public SecondHomeAdapter(Context context, int[] data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @Override
    public SecondHomeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.second_home_page, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SecondHomeAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(mData[position]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_image);

        }
/*
        @Override
        public void onClick(View view) {
            onItemClick(view, getAdapterPosition());
        }
    }

    // Convenience method for getting data at click position
    public int getItem(int id) {
        return mData[id];
    }

    // Method that executes your code for the action received
    public void onItemClick(View view, int position) {
        Log.i("TAG", "You clicked number " + getItem(position).toString() + ", which is at cell position " + position);
    } */
    }
}
