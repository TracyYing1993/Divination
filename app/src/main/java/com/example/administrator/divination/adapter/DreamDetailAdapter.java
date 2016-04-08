package com.example.administrator.divination.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.divination.R;
import com.example.administrator.divination.activity.DreamContentActivity;
import com.example.administrator.divination.util.UrlUtil;

import java.util.List;

/**
 * Created by Administrator on 2016/3/28.
 */
public class DreamDetailAdapter extends BaseAdapter {

    private List<String> list ;

    public DreamDetailAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dream_detail_item_layout, null, false);
        final TextView textView = (TextView) view.findViewById(R.id.dream_detail_item_text);
        textView.setText(list.get(position));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                String url = UrlUtil.searchUrl.replace("%d", s);
                Intent intent = new Intent(parent.getContext(), DreamContentActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("url",url);
                bundle.putString("title",s);
                intent.putExtras(bundle);
                parent.getContext().startActivity(intent);
            }
        });
        return view;
    }
}
