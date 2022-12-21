package com.example.test5.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test5.R;
import com.example.test5.models.ItemModel;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    List<ItemModel> items;

    public ItemAdapter(List<ItemModel> items) {
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item1, viewGroup, false);
            Log.v("TAG", "New view inflated");

            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.image_view);
            viewHolder.textTitle = view.findViewById(R.id.text_title);
            viewHolder.textSubtitle = view.findViewById(R.id.text_subtitle);
            viewHolder.checkSelected = view.findViewById(R.id.check_selected);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        ItemModel item = items.get(i);

        viewHolder.imageView.setImageResource(item.getImageResource());
        viewHolder.textTitle.setText(item.getTitle());
        viewHolder.textSubtitle.setText(item.getSubtitle());
        viewHolder.checkSelected.setChecked(item.isSelected());

        viewHolder.checkSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setSelected(viewHolder.checkSelected.isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView textTitle;
        TextView textSubtitle;
        CheckBox checkSelected;
    }
}
