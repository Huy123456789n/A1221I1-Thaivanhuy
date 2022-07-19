package codyGym.service;

import codyGym.model.Customer;
import codyGym.repository.CustomerRepositoryImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private static CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() throws SQLException {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }
    @Override
    public void deleteCustomer(int id) throws SQLException {
        customerRepository.deleteCustomer(id);
    }
    @Override
    public Customer findById(int id) throws SQLException {
        Customer customer = customerRepository.findById(id);
        return customer;
    }
    @Override
    public void createCustomer(Customer customer) throws SQLException {
        customerRepository.createCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        customerRepository.updateCustomer(customer);
    }

    @Override
    public List<Customer> findByName(String name) throws SQLException {
        List<Customer> customers;
        customers= customerRepository.findByName(name);
        return customers;
    }

    @Override
    public List<Customer> findByAddress(String address) throws SQLException {
        List<Customer> customers;
        customers= customerRepository.findByAddress(address);
        return customers;
    }

    @Override
    public List<String> typeCustomer(int id) throws SQLException {
        List<String> typeCustomer;
        typeCustomer = customerRepository.typeCustomer(id);
        return typeCustomer;
    }
}
