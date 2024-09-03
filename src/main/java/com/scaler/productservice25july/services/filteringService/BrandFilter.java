package com.scaler.productservice25july.services.filteringService;

import com.scaler.productservice25july.models.Product;

import java.util.List;

public class BrandFilter implements Filter {

    @Override
    public List<Product> apply(List<Product> products, List<String> allowedValues) {
        return List.of();
    }
}
