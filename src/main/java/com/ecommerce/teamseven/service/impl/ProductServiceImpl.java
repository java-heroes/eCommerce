package com.ecommerce.teamseven.service.impl;

import com.ecommerce.teamseven.dao.ProductDao;
import com.ecommerce.teamseven.model.Product;
import com.ecommerce.teamseven.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ali Çoşkan Demirbolat on 26/07/2021.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList(Integer offset, Integer maxResults) {
        return productDao.getProductList(offset, maxResults) ;
    }

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void editProduct(Product product) {
        productDao.editProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);
    }

    @Override
    public Long countProducts() {
        return productDao.countProducts();
    }
}

