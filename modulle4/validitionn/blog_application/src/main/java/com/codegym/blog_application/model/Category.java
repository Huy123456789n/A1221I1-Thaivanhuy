package com.codegym.blog_application.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int cate_id;
    private String name;

    @OneToMany(targetEntity = BlogApp.class)
    private List<BlogApp> blogApps;

    public List<BlogApp> getBlogApps() {
        return blogApps;
    }

    public void setBlogApps(List<BlogApp> blogApps) {
        this.blogApps = blogApps;
    }

    public Category(){
    }

    public Category(int id, String name) {
        this.cate_id = id;
        this.name = name;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int id) {
        this.cate_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(List<BlogApp> blogApps) {
        this.blogApps = blogApps;
    }
}
