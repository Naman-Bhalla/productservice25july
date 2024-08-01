package com.scaler.productservice25july.services;

import com.scaler.productservice25july.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dbProductService")
public class ProductServiceDBImpl implements ProductService {

    @Override
    public Product createProduct(Product product) {

        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product partialUpdateProduct(Long productId, Product product) {
        return null;
    }
}
