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
public class StartGridViewAdapter extends BaseAdapter {

    private int[] img = {R.drawable.s01sheep,R.drawable.s02bull,R.drawable.s03double,R.drawable.s04crab,R.drawable.s05lion,R.drawable.s06girl,
    R.drawable.s07balance,R.drawable.s08scorpion,R.drawable.s09shoot,R.drawable.s10maggic,R.drawable.s11bottle,R.drawable.s12fish};

    private String[] name = {"白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天秤座","天蝎座","射手座","魔蝎座","水瓶座","双鱼座"};

    private String[] time ={"3月21日-4月19日","4月20日-5月20日","5月21日-6月21日","6月22日-7月22日","7月23日-8月22日","8月23日-9月22日","9月23日-10月23日","10月24日-11月22日","11月23日-12月21日","12月22日-1月19日","1月20日-2月18日","2月19日-3月20日"};

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.start_grid_item_layout, null, false);
        ImageView imageView = ((ImageView) view.findViewById(R.id.start_grid_item_img));
        TextView startname = ((TextView) view.findViewById(R.id.start_grid_item_name));
        TextView starttime = (TextView) view.findViewById(R.id.start_grid_item_time);

        imageView.setImageResource(img[position]);
        startname.setText(name[position]);
        starttime.setText(time[position]);
        return view;
    }
}
