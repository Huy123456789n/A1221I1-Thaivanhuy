package com.example.product_manager.service;

import com.example.product_manager.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> findAll() throws SQLException;
    void delete(int id) throws SQLException;
    void update(Product product) throws SQLException;
    Product findById(int id) throws SQLException;
    void create (Product product) throws SQLException;
    List<Product> findByName( String name) throws SQLException;
    List<Product> softByName() throws SQLException;
}
