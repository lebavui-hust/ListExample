package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<ImageModel> items;
    ImageView imageBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        items = new ArrayList<>();
        //items.add(new ImageModel("Item 1", R.drawable.thumb1, R.drawable.wall1));
        for (int i = 1; i <= 28; i++) {
            items.add(new ImageModel("Item " + i,
                    getResources().getIdentifier("thumb" + i, "drawable", getPackageName()),
                    getResources().getIdentifier("wall" + i, "drawable", getPackageName())));
        }

        imageBig = findViewById(R.id.image_big);

        LinearLayout mainLayout = findViewById(R.id.main_layout);
        for (int i = 0; i < items.size(); i++) {
            View view = LayoutInflater.from(ThirdActivity.this).inflate(R.layout.layout_item, null);
            view.setId(i);

            ImageView imageView = view.findViewById(R.id.image_view);
            TextView textView = view.findViewById(R.id.text_view);
            imageView.setImageResource(items.get(i).getIdThumb());
            textView.setText(items.get(i).getCaption());

            mainLayout.addView(view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = view.getId();
                    imageBig.setImageResource(items.get(id).getIdBig());
                }
            });
        }
    }
}