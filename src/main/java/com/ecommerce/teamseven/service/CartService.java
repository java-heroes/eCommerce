package com.ecommerce.teamseven.service;

import com.ecommerce.teamseven.model.Cart;

/**
 * Created by Ali Çoşkan Demirbolat on 25/07/2021.
 */
public interface CartService {

    Cart getCartById(int cartId);
    void update(Cart cart);
}
