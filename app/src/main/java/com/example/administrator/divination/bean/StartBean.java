package com.example.administrator.divination.bean;

/**
 * Created by Administrator on 2016/3/29.
 */
public class StartBean {

    /**
     * summary : 你的工作发展似乎进入了困顿期，特别是面临转型却又进入原有模式，暂时无法找到出路。财务状况也是你最为关心的，但是目前活动丰富的你，也需要避免过度开销。
     * work : 60%
     * error_code : 0
     * resultcode : 200
     * number : 6
     * date : 20160329
     * health : 77%
     * love : 60%
     * color : 橙色
     * QFriend : 射手座
     * name : 狮子座
     * money : 60%
     * datetime : 2016年03月29日
     * all : 60%
     */
    private String summary;
    private String work;
    private int error_code;
    private String resultcode;
    private int number;
    private String date;
    private String health;
    private String love;
    private String color;
    private String QFriend;
    private String name;
    private String money;
    private String datetime;
    private String all;
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQFriend(String QFriend) {
        this.QFriend = QFriend;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getSummary() {
        return summary;
    }

    public String getWork() {
        return work;
    }

    public int getError_code() {
        return error_code;
    }

    public String getResultcode() {
        return resultcode;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getHealth() {
        return health;
    }

    public String getLove() {
        return love;
    }

    public String getColor() {
        return color;
    }

    public String getQFriend() {
        return QFriend;
    }

    public String getName() {
        return name;
    }

    public String getMoney() {
        return money;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getAll() {
        return all;
    }

    @Override
    public String toString() {
        return "StartBean{" +
                "summary='" + summary + '\'' +
                ", work='" + work + '\'' +
                ", error_code=" + error_code +
                ", resultcode='" + resultcode + '\'' +
                ", number=" + number +
                ", date=" + date +
                ", health='" + health + '\'' +
                ", love='" + love + '\'' +
                ", color='" + color + '\'' +
                ", QFriend='" + QFriend + '\'' +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", datetime='" + datetime + '\'' +
                ", all='" + all + '\'' +
                '}';
    }
}
