package com.example.test5.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.test5.R;
import com.example.test5.adapters.ChatAdapter;
import com.example.test5.models.ChatModel;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    List<ChatModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        items = new ArrayList<>();
        items.add(new ChatModel("me", R.drawable.thumb1, "Xin chao"));
        items.add(new ChatModel("me", R.drawable.thumb1, "Ban co khoe khong?"));
        items.add(new ChatModel("user1", R.drawable.thumb2, "Toi khoe. Con ban thi sao?"));
        items.add(new ChatModel("me", R.drawable.thumb1, "Toi cung khoe"));

        ChatAdapter adapter = new ChatAdapter(items);
        ListView listChat = findViewById(R.id.list_chat);
        listChat.setAdapter(adapter);
    }
}