package com.codegym.shopping.service;

import com.codegym.shopping.model.Product;
import com.codegym.shopping.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ServiceImpl implements IService{
    @Autowired
    private IRepository repository;

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Product t) {
    repository.save(t);
    }

    @Override
    public void remove(Long id) {
    repository.deleteById(id);
    }
}
