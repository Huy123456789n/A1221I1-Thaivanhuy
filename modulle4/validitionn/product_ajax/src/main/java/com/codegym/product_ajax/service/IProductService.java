package com.codegym.product_ajax.service;

import com.codegym.product_ajax.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void remove(Long id);
}
