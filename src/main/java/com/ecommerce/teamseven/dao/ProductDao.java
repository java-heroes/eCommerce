package com.ecommerce.teamseven.dao;

import kh.com.camarket.model.Product;

import java.util.List;


public interface ProductDao {
    List<Product> getProductList(Integer offset, Integer maxResults);

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

    Long countProducts();
}
