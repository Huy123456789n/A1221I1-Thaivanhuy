package repository;

import model.Category;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepo {
    List<Product> findAll() throws SQLException;
    void delete(int id) throws SQLException;
    void update(Product product) throws SQLException;
    Product findById(int id) throws SQLException;
    void create (Product product) throws SQLException;
    List<Product> findByName(String name) throws SQLException;
    List<Category> findAllCategory() throws SQLException;
}
