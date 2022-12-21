package com.example.test5.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    List<Integer> imageResources;
    int screenWidth;

    public ImageAdapter(List<Integer> imageResources, int screenWidth) {
        this.imageResources = imageResources;
        this.screenWidth = screenWidth;
    }

    @Override
    public int getCount() {
        return imageResources.size();
    }

    @Override
    public Object getItem(int i) {
        return imageResources.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setLayoutParams(new GridView.LayoutParams(screenWidth / 3, screenWidth / 3));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

            imageView.setImageResource(imageResources.get(i));
            view = imageView;
        } else {
            ((ImageView)view).setImageResource(imageResources.get(i));
        }
        return view;
    }
}
