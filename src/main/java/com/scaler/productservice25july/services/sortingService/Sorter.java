package com.scaler.productservice25july.services.sortingService;

import com.scaler.productservice25july.models.Product;

import java.util.List;

public interface Sorter {
    List<Product> sort(List<Product> products);
}
