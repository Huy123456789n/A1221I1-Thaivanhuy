package com.codegym.demo.model;


public class User {
    private String email;
    private String passWork;

    public User(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWork() {
        return passWork;
    }

    public void setPassWork(String passWork) {
        this.passWork = passWork;
    }

    public User(String email, String passWork) {
        this.email = email;
        this.passWork = passWork;
    }
}
