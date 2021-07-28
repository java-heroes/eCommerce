package com.ecommerce.teamseven.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mustafa Yaşar on 25/07/2021.
 */
@Entity
public class CartItem implements Serializable{

    private static final long serialVersionUID = 4682741580084876347L;

    @Id
    @GeneratedValue
    private int cartItemId;

    @ManyToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private  Cart cart;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private int quantity;
    private double totalPrice;

    public int getCartId() {
        return cartItemId;
    }

    public void setCartId(int cartId) {
        this.cartItemId = cartId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
