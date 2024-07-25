package com.scaler.productservice25july.services;

import com.scaler.productservice25july.dtos.CreateProductRequestDto;
import com.scaler.productservice25july.models.Product;

public interface ProductService {

    Product createProduct(Product product);
}
