package com.example.product_manager.repository;

import com.example.product_manager.model.Category;

import java.sql.SQLException;
import java.util.List;

public interface ICategoryRepository {
    List<Category> findAll() throws SQLException;
}
