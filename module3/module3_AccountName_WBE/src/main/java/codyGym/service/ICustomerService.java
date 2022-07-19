package codyGym.service;

import codyGym.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws SQLException;
    void deleteCustomer(int id) throws SQLException;
    Customer findById(int id) throws SQLException;
    void createCustomer(Customer customer) throws SQLException;
    void updateCustomer(Customer customer) throws SQLException;
    List<Customer> findByName(String name) throws SQLException;
    List<Customer> findByAddress(String address) throws SQLException;
    List<String> typeCustomer(int id) throws SQLException;
}
