package com.example.administrator.divination.util;

import android.os.Handler;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016/3/21.
 * 这是一个连网的工具类
 */
public class OkHttpUtils {
    static ExecutorService executorService;//线程池
    static OkHttpClient okHttpClient;
    static Handler handler;
    static Gson gson;
    public static final int TYPE_TEXT = 1;//下载类型为 文本类型
    public static final int TYPE_BYTE = 2;//下载类型为 数组类型

    //静态代码块
    //初始化
    static {
        executorService = Executors.newFixedThreadPool(5);//开启线程池
        okHttpClient = new OkHttpClient();//okHttpClient 不仅可以返回String类型， 还可以返回byte类型 以及以流的形式返回
        handler = new Handler();
        gson = new Gson();
    }

    //回调接口
    //谁调用数据就返回给谁
    public interface callBack {
        void callBackUIString(String data);//返回字符

        void callBackUIByte(byte[] datas);//返回数组(一般用来转换成bitmap)
    }


    //联网下载json字符串数据 模式1
    public static void callBackUIDataFormatOne(final String url, final int type_id, final callBack
            returndata) {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    final String data;
                    final byte[] datas;

                    Request request = new Request.Builder()
                            .url(url).tag(url).build();
                    Response resp = okHttpClient.newCall(request).execute();
                    if (resp.isSuccessful()) {
                        if (type_id == OkHttpUtils.TYPE_TEXT) {
                            data = resp.body().string();
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    returndata.callBackUIString(data);
                                }
                            });
                        } else if (type_id == OkHttpUtils.TYPE_BYTE) {
                            datas = resp.body().bytes();
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    returndata.callBackUIByte(datas);
                                }
                            });
                        }


                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    public static String getReplaceFormat(String url, String format, int page) {
        String urls = url.replaceAll(format, String.valueOf(page));
        return urls;
    }
    public static String getReplaceFormat(String url, String format, String page) {
        String urls = url.replaceAll(format,page);
        return urls;
    }


    public static String getFormatTime(String time) {

        Date date = new Date(Long.parseLong(time));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(date);
        return format1;
    }


}
