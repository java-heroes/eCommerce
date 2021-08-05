package com.ecommerce.teamseven.service.impl;

import com.ecommerce.teamseven.dao.CustomerOrderDao;
import com.ecommerce.teamseven.model.Cart;
import com.ecommerce.teamseven.model.CartItem;
import com.ecommerce.teamseven.model.CustomerOrder;
import com.ecommerce.teamseven.service.CartService;
import com.ecommerce.teamseven.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ali Çoşkan Demirbolat on 26/07/2021.
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId); // sepet servisini kullanarak sepeti al
        List<CartItem> cartItems = cart.getCartItems(); // sepetteki itemları listele
        // Sepet itemlerini dolaş
        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
}
