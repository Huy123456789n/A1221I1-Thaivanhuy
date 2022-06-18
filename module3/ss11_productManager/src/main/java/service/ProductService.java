package service;

import model.Product;

import java.util.List;

public interface ProductService {
void addNew(Product product);
List<Product> displayAll ();
void delete(int id);
void update(int id, Product product);
Product findId(int id);
Product search(String name);
}
