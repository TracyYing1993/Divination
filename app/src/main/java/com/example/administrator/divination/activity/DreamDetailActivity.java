package com.example.administrator.divination.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.administrator.divination.R;
import com.example.administrator.divination.adapter.DreamDetailAdapter;
import com.example.administrator.divination.bean.DreamBean;
import com.example.administrator.divination.util.OkHttpUtils;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DreamDetailActivity extends AppCompatActivity implements OkHttpUtils.callBack{

    private ImageView imageView;
    private String url;
    private GridView gridView;
    private List<String> titleList = new ArrayList<>();
    private DreamDetailAdapter adapter;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_detail);
        url = getIntent().getExtras().getString("url");
        OkHttpUtils.callBackUIDataFormatOne(url, OkHttpUtils.TYPE_TEXT, this);
        imageView = ((ImageView) findViewById(R.id.dream_detail_title_back));
        gridView = ((GridView) findViewById(R.id.dream_detail_gridView));
        gson = new Gson();
        adapter = new DreamDetailAdapter(titleList);
        initView();
    }

    private void initView() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        gridView.setAdapter(adapter);
    }

    @Override
    public void callBackUIString(String data) {

        Log.e("TAG",url);
        Log.e("TAG",data);
        DreamBean dreamBean = gson.fromJson(data, DreamBean.class);
        List<DreamBean.ResultEntity> result = dreamBean.getResult();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            DreamBean.ResultEntity resultEntity = result.get(i);
            String title = resultEntity.getTitle();
            list.add(title);
        }

        titleList.addAll(list);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void callBackUIByte(byte[] datas) {

    }
}
