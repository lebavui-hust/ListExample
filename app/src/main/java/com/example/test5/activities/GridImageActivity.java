package com.example.test5.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.GridView;

import com.example.test5.R;
import com.example.test5.adapters.ImageAdapter;

import java.util.ArrayList;
import java.util.List;

public class GridImageActivity extends AppCompatActivity {

    List<Integer> imageResources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_image);

        imageResources = new ArrayList<>();
        for (int i = 1; i <= 28; i++)
            imageResources.add(getResources().getIdentifier("thumb" + i, "drawable", getPackageName()));

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenWidth = metrics.widthPixels;

        ImageAdapter adapter = new ImageAdapter(imageResources, screenWidth);
        GridView gridView = findViewById(R.id.grid_images);
        gridView.setAdapter(adapter);
    }
}