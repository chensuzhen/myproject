package com.example.administrator.mydaily.model;

/**
 * Created by Administrator on 2016/8/13.
 */
public class TopStory {

    private String id;
    private String title;
    private String image;

    public TopStory(){}

    public TopStory(String id, String title, String image) {//构造方法
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
