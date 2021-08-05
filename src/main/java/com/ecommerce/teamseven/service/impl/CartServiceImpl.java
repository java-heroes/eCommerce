package com.ecommerce.teamseven.service.impl;

import com.ecommerce.teamseven.dao.CartDao;
import com.ecommerce.teamseven.model.Cart;
import com.ecommerce.teamseven.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ali Çoşkan Demirbolat on 24/07/2021.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    @Override
    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
