package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl  implements ProductService{
    List<Product> productArray = new ArrayList<>(product.values());
    Product products;
    private static Map<Integer,Product> product;
    static {
        product = new HashMap<>();
        product.put(1,new Product(1,"Iphone 11",200000,"new 99%"));
        product.put(2,new Product(2,"Samsung S22",100000,"new 90%"));
        product.put(3,new Product(3,"Oppo Vivo",300000,"old 99%"));
    }

    @Override
    public void addNew(Product product1) {
        product.put(product1.getId(),product1);
    }
    @Override
    public List<Product> displayAll() {
        return new ArrayList<>(product.values());
    }
    @Override
    public void delete(int id) {
        product.remove(id);
    }
    @Override
    public void update(int id, Product product2) {
    product.put(id,product2);
    }
    @Override
    public Product findId(int id) {
        return product.get(id);
    }
    @Override
    public Product search(String name) {
        for (int i =0;i<productArray.size();i++){
           if (productArray.get(i).getName().equals(name)){
               products =productArray.get(i);
           }
        } return products;
}}
