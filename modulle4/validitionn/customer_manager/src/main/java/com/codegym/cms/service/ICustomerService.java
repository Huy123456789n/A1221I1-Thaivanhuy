package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer t);

    void remove(Long id);
}
