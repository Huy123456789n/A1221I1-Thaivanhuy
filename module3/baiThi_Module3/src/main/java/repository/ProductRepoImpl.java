package repository;

import model.Category;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo{
    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SQL_SELECT = "select * from product p join category c on c.category_id = p.category_id";
    private static final String SQL_DElETE = "delete from product where id = ?";
    private static final String SQL_SELECT_BY_ID = "select * from product where id = ?";
    private static final String SQL_SELECT_BY_NAME = "select * from product where name like(?)";
    private static final String SQL_INSERT  = "insert into product(name,price,quantity,color,description,category_id) value (?,?,?,?,?,?)";

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

    }

    @Override
    public void update(Product product) throws SQLException {

    }

    @Override
    public Product findById(int id) throws SQLException {
        return null;
    }

    @Override
    public void create(Product product) throws SQLException {
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
        statement.setString(1,product.getName());
        statement.setDouble(2,product.getPrice());
        statement.setInt(3,product.getQuantity());
        statement.setString(4,product.getColor());
        statement.setString(5, product.getDescription());
        statement.setInt(6,product.getCategory_id());
        statement.executeUpdate();
        if (connection != null) connection.close();
        if(statement!= null) statement.close();
    }

    @Override
    public List<Product> findByName(String name) throws SQLException {
        return null;
    }

    @Override
    public List<Category> findAllCategory() throws SQLException {
        List<Category> category = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id_category = Integer.parseInt(resultSet.getString("category_id"));
            String name_category = resultSet.getString("category_name");
            category.add(new Category (id_category,name_category));
        }
        return category;
    }
}
