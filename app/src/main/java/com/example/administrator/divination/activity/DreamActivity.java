package com.example.administrator.divination.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.divination.R;
import com.example.administrator.divination.adapter.DreamGridViewAdapter;
import com.example.administrator.divination.util.UrlUtil;

public class DreamActivity extends AppCompatActivity {

    private ImageView img_back;
    private EditText dream_edText;
    private GridView gridView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream);
        img_back = ((ImageView) findViewById(R.id.dream_title_back));
        dream_edText = ((EditText) findViewById(R.id.dream_edText));
        gridView = ((GridView) findViewById(R.id.dream_gridView));
        initView();
        initGridView();
    }

    private void initGridView() {
        gridView.setAdapter(new DreamGridViewAdapter());
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                url = null;
                Intent intent = new Intent(DreamActivity.this, DreamDetailActivity.class);
                Bundle bundle = new Bundle();
                switch (position){
                    case 0:
                        Toast.makeText(DreamActivity.this, "0", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","人");
                        bundle.putString("url",url);
                        break;
                    case 1:
                        Toast.makeText(DreamActivity.this, "1", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","动物");
                        bundle.putString("url", url);
                        break;
                    case 2:
                        Toast.makeText(DreamActivity.this, "2", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","树");
                        bundle.putString("url", url);
                        break;
                    case 3:
                        Toast.makeText(DreamActivity.this, "3", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","东西");
                        bundle.putString("url", url);
                        break;
                    case 4:
                        Toast.makeText(DreamActivity.this, "4", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","运动");
                        bundle.putString("url", url);
                        break;
                    case 5:
                        Toast.makeText(DreamActivity.this, "5", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","生活");
                        bundle.putString("url", url);
                        break;
                    case 6:
                        Toast.makeText(DreamActivity.this, "6", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","打雷");
                        bundle.putString("url", url);
                        break;
                    case 7:
                        Toast.makeText(DreamActivity.this, "7", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","鬼");
                        bundle.putString("url", url);
                        break;
                    case 8:
                        Toast.makeText(DreamActivity.this, "8", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","建筑");
                        bundle.putString("url", url);
                        break;
                    case 9:
                        Toast.makeText(DreamActivity.this, "9", Toast.LENGTH_SHORT).show();
                        url = UrlUtil.searchUrl2.replace("%d","恶梦");
                        bundle.putString("url", url);
                        break;
                }
                intent.putExtras(bundle);
                DreamActivity.this.startActivity(intent);
            }
        });
    }

    private void initView() {
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dream_edText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String s1 = dream_edText.getText().toString();
                if (s!=null&&!"".equals(s1)){
                    url = UrlUtil.searchUrl2.replace("%d",s1);
                    Intent intent = new Intent(DreamActivity.this, DreamDetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("url", url);
                    intent.putExtras(bundle);
                    DreamActivity.this.startActivity(intent);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
