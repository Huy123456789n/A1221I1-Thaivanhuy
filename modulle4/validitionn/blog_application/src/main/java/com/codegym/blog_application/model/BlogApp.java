package com.codegym.blog_application.model;

import javax.persistence.*;


@Entity
public class BlogApp {
    @Id
    private int id;
    private String name;
    private String time;

    @ManyToOne
    @JoinColumn(name= "cate_id")
    private Category cate;

    public Category getCate() {
        return cate;
    }

    public void setCate(Category cate) {
        this.cate = cate;
    }

    public BlogApp(int id, String name, String time, Category cate) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.cate = cate;
    }

    public BlogApp(){
    }

    public BlogApp(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
