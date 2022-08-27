package com.codegym.product_ajax.service;

import com.codegym.product_ajax.model.Product;
import com.codegym.product_ajax.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }


    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
    return productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
    productRepository.deleteById(id);
    }
}
