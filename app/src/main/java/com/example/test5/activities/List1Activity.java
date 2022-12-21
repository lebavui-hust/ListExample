package com.example.test5.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.test5.R;
import com.example.test5.adapters.ItemAdapter;
import com.example.test5.models.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class List1Activity extends AppCompatActivity {

    List<ItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        items = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
            items.add(new ItemModel(getResources().getIdentifier("thumb" + i, "drawable", getPackageName()),
                    "Title " + i,
                    "Subtitle " + i));

        ItemAdapter adapter = new ItemAdapter(items);
        ListView listItems = findViewById(R.id.list_items);
        listItems.setAdapter(adapter);
    }
}