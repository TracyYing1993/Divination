package com.example.administrator.divination.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.divination.R;
import com.example.administrator.divination.fragment.StartFragment;
import com.example.administrator.divination.util.UrlUtil;

public class StartDetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TabLayout tabLayout;
    private String startName;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_detail);
        startName = getIntent().getExtras().getString("startName");
        Log.e("TAG","startName:"+startName);
        url = UrlUtil.start.replace("%d",startName);
        imageView = ((ImageView) findViewById(R.id.start_detail_title_back));
        tabLayout = ((TabLayout) findViewById(R.id.start_Tablayout));
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        StartFragment startFragment = new StartFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        bundle.putInt("type",1);
        startFragment.setArguments(bundle);
        transaction.replace(R.id.start_fragment_container, startFragment);
        transaction.commit();


        initTabLayout();
        initImg();
    }

    private void initTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText("今日").setTag("today"));
        tabLayout.addTab(tabLayout.newTab().setText("明日").setTag("tomorrow"));
        tabLayout.addTab(tabLayout.newTab().setText("本周").setTag("week"));
        tabLayout.addTab(tabLayout.newTab().setText("下周").setTag("nextweek"));
        tabLayout.addTab(tabLayout.newTab().setText("本月").setTag("month"));
        tabLayout.addTab(tabLayout.newTab().setText("今年").setTag("year"));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                String type = (String) tab.getTag();
                String url = UrlUtil.start2.replace("%d",startName);
                url = url.replace("%c",type);
                Log.e("TAG","url:"+url);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                StartFragment startFragment = new StartFragment();
                Bundle bundle = new Bundle();
                bundle.putString("url",url);
                if (position==0||position==1){
                    bundle.putInt("type",1);
                }else if(position == 2||position==3){
                    bundle.putInt("type",2);
                }else if(position == 4){
                    bundle.putInt("type",3);
                }else if(position == 5){
                    bundle.putInt("type",4);
                }
                startFragment.setArguments(bundle);
                transaction.replace(R.id.start_fragment_container, startFragment);
                transaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

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
