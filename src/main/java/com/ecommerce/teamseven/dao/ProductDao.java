package com.ecommerce.dao;

import com.ecommerce.model.Product;

import java.util.List;


public interface ProductDao {
    List<Product> getProductList(Integer offset, Integer maxResults);

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

    Long countProducts();
}
