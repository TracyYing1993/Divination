package com.example.administrator.divination.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.divination.R;
import com.example.administrator.divination.bean.DreamBean;
import com.example.administrator.divination.util.OkHttpUtils;
import com.google.gson.Gson;

import java.util.List;

public class DreamContentActivity extends AppCompatActivity implements OkHttpUtils.callBack{

    private ImageView imageView;
    private TextView title;
    private LinearLayout content;
    private String url;
    private Gson gson;
    private String big_Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_content);
        imageView = ((ImageView) findViewById(R.id.dreamContent_title_back));
        title = ((TextView) findViewById(R.id.dreamContentTitle));
        content = ((LinearLayout) findViewById(R.id.dreamContentLayout));
        url = getIntent().getExtras().getString("url");
        big_Title = getIntent().getExtras().getString("title");
        title.setText(big_Title);
        gson = new Gson();
        OkHttpUtils.callBackUIDataFormatOne(url,OkHttpUtils.TYPE_TEXT,this);
        initView();
    }

    private void initView() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void callBackUIString(String data) {
        Log.e("TAG",url);
        Log.e("TAG",data);
        gson = new Gson();
        DreamBean dreamBean = gson.fromJson(data, DreamBean.class);
        List<DreamBean.ResultEntity> result = dreamBean.getResult();
        for (int i = 0; i < result.size(); i++) {
            if (i<=6){
                DreamBean.ResultEntity resultEntity = result.get(i);
                TextView textView = new TextView(this);
                textView.setText(resultEntity.getTitle());
                textView.setTextColor(Color.BLACK);
                content.addView(textView);
                TextView textView1 = new TextView(this);
                String[] list = resultEntity.getList();
                if (list.length == 0||list == null){
                    textView1.setText(resultEntity.getDes());
                }else{
                    for (int j = 0; j < list.length; j++) {
                        textView1.append(list[j]);
                    }
                }
                textView1.setTextColor(Color.BLACK);
                content.addView(textView1);
            }

        }

    }

    @Override
    public void callBackUIByte(byte[] datas) {

    }
}
