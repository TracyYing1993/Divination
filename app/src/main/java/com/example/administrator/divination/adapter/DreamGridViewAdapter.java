package com.example.administrator.divination.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.divination.R;

/**
 * Created by Administrator on 2016/3/28.
 */
public class DreamGridViewAdapter extends BaseAdapter {

    private int img[] = {R.drawable.dream_person,R.drawable.dream_animal,R.drawable.dream_plant,
    R.drawable.dream_goods,R.drawable.dream_event,R.drawable.dream_life,
    R.drawable.dream_nature,R.drawable.dream_ghost,R.drawable.dream_building,R.drawable.dream_else};


    private String[] title = {"人物","动物","植物","物品","运动","生活","打雷","鬼","建筑","恶梦"};


    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return img[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dream_grid_item_layout, null, false);
        ImageView imageView = ((ImageView) view.findViewById(R.id.dream_item_img));
        TextView text = (TextView) view.findViewById(R.id.dream_item_text);
        imageView.setImageResource(img[position]);
        text.setText(title[position]);
        return view;
    }
}
