package com.ecommerce.teamseven.service;

import com.ecommerce.teamseven.model.Cart;
import com.ecommerce.teamseven.model.CartItem;

/**
 * Created by Ali Çoşkan Demirbolat on 25/07/2021.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);
    void removeCartItem(CartItem cartItem);
    void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(int productId);
}