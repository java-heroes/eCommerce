package com.ecommerce.teamseven.service.impl;

import com.ecommerce.teamseven.dao.CartItemDao;
import com.ecommerce.teamseven.model.Cart;
import com.ecommerce.teamseven.model.CartItem;
import com.ecommerce.teamseven.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ali Çoşkan Demirbolat on 24/07/2017.

 */
@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemDao cartItemDao;

    @Override
    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    @Override
    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    @Override
    public void removeAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);
    }

    @Override
    public CartItem getCartItemByProductId(int productId) {
        return cartItemDao.getCartItemByProductId(productId);
    }
}
