package com.ecommerce.teamseven.dao;

import kh.com.camarket.model.Cart;
import kh.com.camarket.model.CartItem;


public interface CartItemDao {

    void addCartItem(CartItem cartItem);
    void removeCartItem(CartItem cartItem);
    void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(int productId);

}
