package com.codegym.shopping.service;

import com.codegym.shopping.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    void save(Product t);

    void remove(Long id);
}
