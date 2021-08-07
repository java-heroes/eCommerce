package com.ecommerce.teamseven.dao;

import com.ecommerce.teamseven.model.Customer;
import java.util.List;

public interface CustomerDao {
    void addCustomer(Customer customer);
    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers(Integer offset, Integer maxResults);
    Long countCustomers();
    Customer getCustomerByUsername(String username);
}
