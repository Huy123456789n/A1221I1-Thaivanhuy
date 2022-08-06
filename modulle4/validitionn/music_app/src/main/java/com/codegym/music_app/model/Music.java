package com.codegym.music_app.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Music {
    @Id
    private int id;
    private String Name;
    private String singer;
    private String type;
    private String link;


    public Music(){
    }

    public Music(int id, String name, String singer, String type, String link) {
        this.id = id;
        Name = name;
        this.singer = singer;
        this.type = type;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
