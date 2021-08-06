package com.ecommerce.teamseven.dao;

import com.ecommerce.teamseven.model.Cart;

import java.io.IOException;


import java.io.IOException;


public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);

}

