package com.codegym.product_ajax.repository;

import com.codegym.product_ajax.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}
