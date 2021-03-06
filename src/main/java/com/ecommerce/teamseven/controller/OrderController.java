package com.ecommerce.teamseven.controller;

import com.ecommerce.teamseven.model.Cart;
import com.ecommerce.teamseven.model.Customer;
import com.ecommerce.teamseven.model.CustomerOrder;
import com.ecommerce.teamseven.service.CartService;
import com.ecommerce.teamseven.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
        CustomerOrder customerOrder = new CustomerOrder(); //generate customer order
        Cart cart = cartService.getCartById(cartId); // retrieve cart using cart service
        customerOrder.setCart(cart); // set cart for customer order as current cart

        Customer customer = cart.getCustomer(); //create customer
        customerOrder.setCustomer(customer); // set customer
        customerOrder.setBillingAddress(customer.getBillingAddress());
        customerOrder.setShippingAddress(customer.getShippingAddress());

        customerOrderService.addCustomerOrder(customerOrder); // use customer order service to add customer order

        return "redirect:/checkout?cartId="+cartId;
   }
}
