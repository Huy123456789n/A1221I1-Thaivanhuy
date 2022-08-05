package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService{
    private static Map<Integer, Product> productMap;
static {
    productMap.put(1,new Product(1,"Iphone",799,"New 99%","Apple"));
    productMap.put(2,new Product(2,"SamSung",1199,"New 99%","SamSung"));
    productMap.put(3,new Product(3,"Oppo",899,"New 99%","China"));
    productMap.put(4,new Product(4,"Nokia",499,"New 99%","Apple"));
}

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }
}
