package com.ecommerce.teamseven.service;

import com.ecommerce.teamseven.model.Customer;

import java.util.List;

/**
 * Created by Ali Çoşkan Demirbolat on 28/07/2021.
 */
public interface CustomerService {

    void addCustomer(Customer customer);
    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers(Integer offset, Integer maxResults);
    Long countCustomers();
    Customer getCustomerByUsername(String username);
}