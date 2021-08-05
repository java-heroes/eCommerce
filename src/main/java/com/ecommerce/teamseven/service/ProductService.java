package com.ecommerce.teamseven.service;

import com.ecommerce.teamseven.model.Product;

import java.util.List;

/**
 * Created by Ali Çoşkan Demirbolat on 28/07/2021.
 */
public interface ProductService {
    List<Product> getProductList(Integer offset, Integer maxResults);

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

    Long countProducts();
}