package com.scaler.productservice25july.services.filteringService;

import com.scaler.productservice25july.models.Product;

import java.util.List;

public interface Filter {

    List<Product> apply(List<Product> products,
                        List<String> allowedValues);
}
