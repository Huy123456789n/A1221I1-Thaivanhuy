package codyGym.repository;

import codyGym.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll() throws SQLException;
    void deleteCustomer(int id) throws SQLException;
    Customer findById(int id) throws SQLException;
    void createCustomer(Customer customer) throws SQLException;
    void updateCustomer(Customer customer) throws SQLException;
}
