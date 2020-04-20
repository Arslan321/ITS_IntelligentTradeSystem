package com.example.its;

public class Model {
    String pairs , time , date;
    int first_pair_imgs , last_pair_imgs;
    String value_low,value_high;
    public Model(String pairs , String time ,String date ,int first_pair_img , int last_pair_img
    ,String value_high , String value_low) {
    this.pairs = pairs;
    this.time = time;
    this.date = date;
    this.first_pair_imgs = first_pair_img;
    this.last_pair_imgs = last_pair_img;
    this.value_high = value_high;
    this.value_low = value_low;
    }

    public String getPairs() {
        return pairs;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public int getFirst_pair_imgs() {
        return first_pair_imgs;
    }

    public int getLast_pair_imgs() {
        return last_pair_imgs;
    }

    public String getValue_low() {
        return value_low;
    }

    public String getValue_high() {
        return value_high;
    }
}
