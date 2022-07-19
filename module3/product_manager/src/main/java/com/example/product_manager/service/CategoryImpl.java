package com.example.product_manager.service;

import com.example.product_manager.model.Category;
import com.example.product_manager.repository.CategoryRepository;
import com.example.product_manager.repository.ICategoryRepository;

import java.sql.SQLException;
import java.util.List;

public class CategoryImpl implements ICategoryRepository {
    ICategoryRepository categoryRepository = new CategoryRepository();
    @Override
    public List<Category> findAll() throws SQLException {
        List<Category> categories;
        categories= categoryRepository.findAll();
        return categories;
    }
}
