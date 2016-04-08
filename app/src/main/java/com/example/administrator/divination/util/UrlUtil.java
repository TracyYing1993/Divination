package com.example.administrator.divination.util;

/**
 * Created by Administrator on 2016/3/28.
 */
public class UrlUtil {
    //解梦分类
    public static String dreamClassify = "http://v.juhe.cn/dream/category?key=57b8d5b0d2a9457bf875774013dd4fee";
//关键字搜索
    public static String searchUrl = "http://v.juhe.cn/dream/query?key=57b8d5b0d2a9457bf875774013dd4fee&q=%d&full=1";
    public static String searchUrl2 = "http://v.juhe.cn/dream/query?key=57b8d5b0d2a9457bf875774013dd4fee&q=%d";
//星座运势
//name 星座名
//type = today,tomorrow,week,nextweek,month,year
    //today,tomorrow
    //week,nextweek
    //month
    //year
  public static String start = "http://web.juhe.cn:8080/constellation/getAll?consName=%d&type=today&key=360bd0afcae3e55a9ef02322cb5faa34";
    public static String start2 = "http://web.juhe.cn:8080/constellation/getAll?consName=%d&type=%c&key=360bd0afcae3e55a9ef02322cb5faa34";
}
