package com.ecommerce.teamseven.service.impl;

import com.ecommerce.teamseven.dao.CustomerDao;
import com.ecommerce.teamseven.model.Customer;
import com.ecommerce.teamseven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ali Çoşkan Demirbolat on 26/07/2021.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return customerDao.getCustomerById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers(Integer offset, Integer maxResults) {
        return customerDao.getAllCustomers(offset, maxResults);
    }

    @Override
    public Long countCustomers() {
        return customerDao.countCustomers();
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        return customerDao.getCustomerByUsername(username);
    }
}
