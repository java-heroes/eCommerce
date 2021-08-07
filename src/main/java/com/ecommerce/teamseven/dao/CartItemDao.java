package com.ecommerce.teamseven.dao;

import com.ecommerce.teamseven.model.Cart;
import com.ecommerce.teamseven.model.CartItem;

public interface CartItemDao {

    void addCartItem(CartItem cartItem);
    void removeCartItem(CartItem cartItem);
    void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(int productId);

}
