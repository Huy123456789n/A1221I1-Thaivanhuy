package com.codegym.productmanager.service;

import com.codegym.productmanager.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface IProductService extends IGeneralService<Product> {
    @Override
    Iterable<Product> findAll();

    @Override
    Optional<Product> findById(Long id);

    @Override
    void save(Product product);

    @Override
    void remove(Long id);
}
