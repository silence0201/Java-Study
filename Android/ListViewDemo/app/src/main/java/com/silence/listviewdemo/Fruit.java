package com.silence.listviewdemo;

/**
 * Created by silence on 2017/4/22.
 */

public class Fruit {
    private String name ;
    private int imageId ;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

}
