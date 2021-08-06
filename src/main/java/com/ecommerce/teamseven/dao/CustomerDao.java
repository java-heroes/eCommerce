package com.ecommerce.dao;

import com.ecommerce.model.Customer;

import java.util.List;


public interface CustomerDao {

    void addCustomer(Customer customer);
    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers(Integer offset, Integer maxResults);
    Long countCustomers();
    Customer getCustomerByUsername(String username);
}
