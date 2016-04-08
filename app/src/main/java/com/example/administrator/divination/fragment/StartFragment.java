package com.example.administrator.divination.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.divination.R;
import com.example.administrator.divination.bean.StartBean;
import com.example.administrator.divination.bean.StartYearBean;
import com.example.administrator.divination.util.OkHttpUtils;
import com.google.gson.Gson;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 2016/3/29.
 */
public class StartFragment extends Fragment implements OkHttpUtils.callBack{

    private String url;
    private TextView textName;
    private TextView fragmentConclusion;
    private TextView fragmentHealth;
    private TextView fragmentLove;
    private TextView fragmentMoney;
    private TextView fragmentJob;
    private TextView fragmentNum;
    private TextView fragmentColor;
    private TextView fragmentQfriend;
    private TextView fragmentSummary;
    private Gson gson;
    private int type;
    private TextView weekStartName;
    private TextView weekHealth;
    private TextView weekLove;
    private TextView weekMoney;
    private TextView weekWork;
    private TextView weekJob;
    private TextView monthStartName;
    private TextView monthConclusion;
    private TextView monthHealth;
    private TextView monthMoney;
    private TextView monthWork;
    private TextView monthLove;
    private TextView yearStartName;
    private TextView yearConclusion;
    private TextView yearWork;
    private TextView yearLove;
    private TextView yearHealth;
    private TextView yearMoney;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        url = getArguments().getString("url");
        type = getArguments().getInt("type");
        Log.e("TAG","type  ++++++"+type);
        gson = new Gson();
        OkHttpUtils.callBackUIDataFormatOne(url,OkHttpUtils.TYPE_TEXT,this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (type==1){
            View view = inflater.inflate(R.layout.start_fragment_layout, container, false);
            textName = ((TextView) view.findViewById(R.id.startName));
            fragmentConclusion = ((TextView) view.findViewById(R.id.fragment_conclusion));
            fragmentHealth = ((TextView) view.findViewById(R.id.fragment_health));
            fragmentLove = ((TextView) view.findViewById(R.id.fragment_love));
            fragmentMoney = ((TextView) view.findViewById(R.id.fragment_money));
            fragmentJob = ((TextView) view.findViewById(R.id.fragment_job));
            fragmentNum = ((TextView) view.findViewById(R.id.fragment_number));
            fragmentColor = ((TextView) view.findViewById(R.id.fragment_color));
            fragmentQfriend = ((TextView) view.findViewById(R.id.fragment_QFriend));
            fragmentSummary = ((TextView) view.findViewById(R.id.fragment_summary));
            return view;
        }else if(type==2){
            View view = inflater.inflate(R.layout.start_week_fragment_layout, container, false);
            weekStartName = ((TextView) view.findViewById(R.id.week_startName));
            weekHealth = ((TextView) view.findViewById(R.id.fragment_week_health));
            weekLove = ((TextView) view.findViewById(R.id.fragment_week_love));
            weekMoney = ((TextView) view.findViewById(R.id.fragment_week_money));
            weekWork = ((TextView) view.findViewById(R.id.fragment_week_work));
            weekJob = ((TextView) view.findViewById(R.id.fragment_week_job));
            return view;
        }else if(type == 3){
            View view = inflater.inflate(R.layout.start_month_fragment_layout, container, false);
            monthStartName = ((TextView) view.findViewById(R.id.month_startName));
            monthConclusion = ((TextView) view.findViewById(R.id.fragment_month_conclusion));
            monthHealth = ((TextView) view.findViewById(R.id.fragment_month_health));
            monthMoney = ((TextView) view.findViewById(R.id.fragment_month_money));
            monthWork = ((TextView) view.findViewById(R.id.fragment_month_work));
            monthLove = ((TextView) view.findViewById(R.id.fragment_month_love));
            return view;
        }else if(type == 4){
            View view = inflater.inflate(R.layout.start_year_fragment_layout, container, false);
            yearStartName = ((TextView) view.findViewById(R.id.year_startName));
            yearConclusion = ((TextView) view.findViewById(R.id.fragment_year_conclusion));
            yearWork = ((TextView) view.findViewById(R.id.fragment_year_work));
            yearLove = ((TextView) view.findViewById(R.id.fragment_year_love));
            yearHealth = ((TextView) view.findViewById(R.id.fragment_year_health));
            yearMoney = ((TextView) view.findViewById(R.id.fragment_year_money));
            return view;
        }
        return null;
    }

    @Override
    public void callBackUIString(String data) {
        if (type ==4){
            StartYearBean startYearBean = gson.fromJson(data, StartYearBean.class);
            Log.e("TAG","year"+startYearBean.toString());
            yearStartName.setText(startYearBean.getName());
            yearConclusion.setText(startYearBean.getMima().getText().get(0));
            yearWork.setText(startYearBean.getFinance().get(0));
            yearLove.setText(startYearBean.getLove().get(0));
            yearHealth.setText(startYearBean.getHealth().get(0));
            yearMoney.setText(startYearBean.getFinance().get(0));
        }else{
            StartBean bean = gson.fromJson(data, StartBean.class);
            if (type==1){
                Log.e("TAG",bean.toString());
                textName.setText(bean.getName());
                fragmentConclusion.setText(bean.getAll());
                fragmentHealth.setText(bean.getHealth());
                fragmentLove.setText(bean.getLove());
                fragmentMoney.setText(bean.getMoney());
                fragmentJob.setText(bean.getWork());
                fragmentNum.setText(bean.getNumber() + "");
                fragmentColor.setText(bean.getColor());
                fragmentQfriend.setText(bean.getQFriend());
                fragmentSummary.setText(bean.getSummary());
            }else if(type==2){
                weekStartName.setText(bean.getName());
                weekHealth.setText(bean.getHealth());
                weekLove.setText(bean.getLove());
                weekMoney.setText(bean.getMoney());
                weekWork.setText(bean.getWork());
                weekJob.setText(bean.getJob());
            }else if(type == 3){
                monthStartName.setText(bean.getName());
                monthConclusion.setText(bean.getAll());
                monthHealth.setText(bean.getHealth());
                monthMoney.setText(bean.getMoney());
                monthWork.setText(bean.getWork());
                monthLove.setText(bean.getLove());
            }

        }

    }

    @Override
    public void callBackUIByte(byte[] datas) {

    }
}
