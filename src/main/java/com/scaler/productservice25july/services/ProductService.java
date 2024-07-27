package com.scaler.productservice25july.services;

import com.scaler.productservice25july.models.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product partialUpdateProduct(Long productId, Product product);
}
