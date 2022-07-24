package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> findAll ();
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
    void save(Customer customer);
}
