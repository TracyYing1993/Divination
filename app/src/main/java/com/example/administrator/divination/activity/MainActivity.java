package com.example.administrator.divination.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.divination.R;
import com.example.administrator.divination.adapter.MainGridViewAdapter;

public class MainActivity extends AppCompatActivity {


    private GridView gridView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = ((GridView) findViewById(R.id.main_gridView));
        imageView = ((ImageView) findViewById(R.id.main_login));
        initImg();
        initGridView();
    }

    private void initImg() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initGridView() {
        MainGridViewAdapter adapter = new MainGridViewAdapter();
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, DreamActivity.class);
                        MainActivity.this.startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, StartActivity.class);
                        MainActivity.this.startActivity(intent1);
                        break;
                }
            }
        });
    }


}
