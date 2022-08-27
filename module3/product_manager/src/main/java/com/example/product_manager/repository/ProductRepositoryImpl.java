package com.example.product_manager.repository;

import com.example.product_manager.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository{

    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SQL_SELECT = "select * from product p join category c on c.category_id = p.category_id";
    private static final String SQL_DElETE = "delete from product where id = ?";
    private static final String SQL_SELECT_BY_ID = "select * from product p join category c on c.category_id = p.category_id where id = ?";
    private static final String SQL_SELECT_BY_NAME = "select * from product p join category c on c.category_id = p.category_id where name like(?)";
    private static final String SQL_INSERT  = "insert into product(id,name,price,quantity,color,description,category_id) value (?,?,?,?,?,?,?)";
    private static final String SQL_SOFT_BY_NAME = "select * from product p join category c on c.category_id= p.category_id order by name ";
    private static final String SQL_UPDATE = "update product set name=?,price=?,quantity=?,color=?,description=?,category_id=? where id =?";
    @Override
    public List<Product> findAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double price = resultSet.getDouble("price");
            int quantity = resultSet.getInt("quantity");
            String color = resultSet.getString("color");
            String description = resultSet.getString("description");
            String category = resultSet.getString("category_name");
            products.add(new Product(id,name,price,quantity,color,description,category));
        }
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
        if (resultSet != null) resultSet.close();
        return products;
    }
    @Override
    public void delete(int id) throws SQLException {
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_DElETE);
        statement.setInt(1,id);
        statement.executeUpdate();
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
    }
    @Override
    public void update(Product product) throws SQLException {
    Connection connection = connectionDB.getConnection();
    String query = SQL_UPDATE;
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setInt(7,product.getId());
    statement.setString(1,product.getName());
    statement.setDouble(2,product.getPrice());
    statement.setInt(3,product.getQuantity());
    statement.setString(4, product.getColor());
    statement.setString(6, product.getCategory());
    statement.setString(5, product.getDescription());
    statement.executeUpdate();
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
    }
    @Override
    public Product findById(int id) throws SQLException {
        Product product = null;
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_ID);
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            double price = resultSet.getDouble("price");
            int quantity = resultSet.getInt("quantity");
            String color = resultSet.getString("color");
            String description = resultSet.getString("description");
            String category = resultSet.getString("category_name");
        product = new Product(id,name,price,quantity,color,description,category);
        }
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
        if (resultSet != null) resultSet.close();
        return product;
    }
    @Override
    public void create(Product product) throws SQLException {
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
        statement.setInt(1,product.getId());
        statement.setString(2, product.getName());
        statement.setDouble(3,product.getPrice());
        statement.setInt(4,product.getQuantity());
        statement.setString(5, product.getColor());
        statement.setString(6, product.getDescription());
        statement.setString(7, product.getCategory());
        statement.executeUpdate();
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
    }
    @Override
    public List<Product> findByName(String name) throws SQLException {
        List<Product> products = new ArrayList<>();
    Connection connection = connectionDB.getConnection();
    PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_NAME);
    statement.setString(1,name);
    ResultSet resultSet = statement.executeQuery();
    while (resultSet.next()){
        int id = resultSet.getInt("id");
        String name_pro = resultSet.getString("name");
        double price = resultSet.getDouble("price");
        int quantity = resultSet.getInt("quantity");
        String color = resultSet.getString("color");
        String description = resultSet.getString("description");
        String category = resultSet.getString("category_name");
        products.add(new Product(id,name_pro,price,quantity,color,description,category));
    }
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
        if (resultSet != null) resultSet.close();
        return products;
    }
    @Override
    public List<Product> findByPrice(double price) {

        return null;
    }
    @Override
    public List<Product> softByName() throws SQLException {
        List<Product> products = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SOFT_BY_NAME);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double price = resultSet.getDouble("price");
            int quantity = resultSet.getInt("quantity");
            String color = resultSet.getString("color");
            String category = resultSet.getString("name_category");
            products.add(new Product(id,name,price,quantity,color,category));
        }
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
        if (resultSet != null) resultSet.close();
        return products;
    }
}
