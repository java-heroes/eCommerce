package com.ecommerce.teamseven.controller;

import com.ecommerce.teamseven.model.Product;
import com.ecommerce.teamseven.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public String getProducts(Model model, Integer offset, Integer maxResults) {
        List<Product> products = productService.getProductList(offset, maxResults);
        model.addAttribute("products", products);
        model.addAttribute("count", productService.countProducts());
        model.addAttribute("offset", offset);

        return "productList";
    }

    @RequestMapping("/viewProduct/{productId}")
    public String viewProduct(@PathVariable int productId, Model model) throws IOException {
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);

        return "viewProduct";
    }

}
