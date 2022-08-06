package com.codegym.blog_application.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class BlogApp {
    @Id
    private int id;
    private String name;
    private LocalDate time;

    public BlogApp(){
    }

    public BlogApp(int id, String name, LocalDate time) {
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

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
}
