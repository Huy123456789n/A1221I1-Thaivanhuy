package com.codegym.count_view.model;


import javax.persistence.Entity;


public class Counter {
    private int Count;

    public Counter(){
    }

    public Counter(int count) {
        Count = count;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}
