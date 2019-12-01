package com.example.easylaw.item;

import android.widget.ImageView;

public class Lawer {
    String img;
    String category;
    String name;
    String phonNum;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonNum() {
        return phonNum;
    }

    public void setPhonNum(String phonNum) {
        this.phonNum = phonNum;
    }

    public Lawer(String img, String category, String name, String phonNum) {
        this.img = img;
        this.category = category;
        this.name = name;
        this.phonNum = phonNum;
    }
}
