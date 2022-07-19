package service;

import model.Category;
import model.Product;
import repository.IProductRepo;
import repository.ProductRepoImpl;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    private IProductRepo productRepo = new ProductRepoImpl();
    @Override
    public List<Product> findAll() throws SQLException {
        List<Product> products = productRepo.findAll();
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
        productRepo.create(product);

    }

    @Override
    public List<Product> findByName(String name) throws SQLException {
        return null;
    }

    @Override
    public List<Category> findAllCategory() throws SQLException {
        List<Category> categories = productRepo.findAllCategory();
        return categories;
    }
}
