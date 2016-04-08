package com.example.administrator.divination.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


import com.example.administrator.divination.R;
import com.example.administrator.divination.adapter.StartGridViewAdapter;

public class StartActivity extends AppCompatActivity {

    private ImageView imageView;
    private StartGridViewAdapter adapter;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        imageView = ((ImageView) findViewById(R.id.start_title_back));
        gridView = ((GridView) findViewById(R.id.start_gridView));
        initGridView();
        initImg();
    }

    private void initGridView() {
        adapter = new StartGridViewAdapter();
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(StartActivity.this, StartDetailActivity.class);
                Bundle bundle = new Bundle();
                String startName = null;
                switch (position){
                    case 0:
                       startName = "白羊座";
                        break;
                    case 1:
                        startName = "金牛座";
                        break;
                    case 2:
                        startName = "双子座";
                        break;
                    case 3:
                        startName = "巨蟹座";
                        break;
                    case 4:
                        startName = "狮子座";
                       break;
                    case 5:
                        startName = "处女座";
                        break;
                    case 6:
                        startName = "天秤座";
                        break;
                    case 7:
                        startName = "天蝎座";
                        break;
                    case 8:
                        startName = "射手座";
                        break;
                    case 9:
                        startName = "魔蝎座";
                        break;
                    case 10:
                        startName = "水瓶座";
                        break;
                    case 11:
                        startName = "双鱼座";
                        break;
                }
                bundle.putString("startName",startName);
                intent.putExtras(bundle);
                StartActivity.this.startActivity(intent);
            }
        });
    }

    private void initImg() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
