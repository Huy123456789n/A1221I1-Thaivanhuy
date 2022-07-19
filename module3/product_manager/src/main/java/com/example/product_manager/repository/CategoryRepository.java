package com.example.product_manager.repository;

import com.example.product_manager.model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository {
    private static final String SQL_SELECT = "select * from category";
    ConnectionDB connectionDB = new ConnectionDB();

    @Override
    public List<Category> findAll() throws SQLException {
        List<Category> category = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String id_category = resultSet.getString("category_id");
            String name_category = resultSet.getString("category_name");
            category.add(new Category (id_category,name_category));
        }
        return category;
    }
}
