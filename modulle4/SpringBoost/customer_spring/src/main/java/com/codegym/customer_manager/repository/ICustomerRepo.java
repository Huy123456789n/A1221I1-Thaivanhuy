package com.codegym.customer_manager.repository;

import com.codegym.customer_manager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer,Long> {
}
