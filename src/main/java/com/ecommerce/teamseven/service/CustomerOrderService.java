package com.ecommerce.teamseven.service;

import com.ecommerce.teamseven.model.CustomerOrder;

/**
 * Created by Ali Çoşkan Demirbolat on 25/07/2021.
 */
public interface CustomerOrderService {
    void addCustomerOrder(CustomerOrder customerOrder);
    double getCustomerOrderGrandTotal(int cartId);
}