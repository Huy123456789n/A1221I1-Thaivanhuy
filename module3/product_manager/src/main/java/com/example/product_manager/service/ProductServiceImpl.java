package com.example.product_manager.service;

import com.example.product_manager.model.Product;
import com.example.product_manager.repository.IProductRepository;
import com.example.product_manager.repository.ProductRepositoryImpl;
import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService{
   private IProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() throws SQLException {
        List<Product> products;
        products = productRepository.findAll();
        return products;
    }

    @Override
    public void delete(int id) throws SQLException {
    productRepository.delete(id);
    }

    @Override
    public void update(Product product) throws SQLException {
        productRepository.update(product);
    }

    @Override
    public Product findById(int id) throws SQLException {
        Product product = null;
        product = productRepository.findById(id);
        return product;
    }
    @Override
    public void create(Product product) throws SQLException {
        productRepository.create(product);
    }

    @Override
    public List<Product> findByName(String name) throws SQLException {
        List<Product> products = null;
        products = productRepository.findByName(name);
        return products;
    }

    @Override
    public List<Product> softByName() throws SQLException {
        List<Product> products;
        products = productRepository.softByName();
        return products;
    }
}
