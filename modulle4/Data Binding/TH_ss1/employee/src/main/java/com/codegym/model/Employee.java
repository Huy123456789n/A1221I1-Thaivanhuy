package com.codegym.model;

public class Employee {
    private int id;
    private String name;
    private String contact;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public Employee() {

    }

    public Employee(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
}
