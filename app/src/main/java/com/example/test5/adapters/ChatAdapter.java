package com.example.test5.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test5.R;
import com.example.test5.models.ChatModel;

import java.util.List;

public class ChatAdapter extends BaseAdapter {

    List<ChatModel> items;

    public ChatAdapter(List<ChatModel> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position).getUsername().equals("me"))
            return 1;
        else
            return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            if (getItemViewType(i) == 0)
                view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.layout_item_left, viewGroup, false);
            else
                view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.layout_item_right, viewGroup, false);
        }

        ImageView imageAvatar = view.findViewById(R.id.image_avatar);
        TextView textMessage = view.findViewById(R.id.text_message);

        ChatModel item = items.get(i);
        imageAvatar.setImageResource(item.getAvatarResource());
        textMessage.setText(item.getMessage());

        return view;
    }
}
