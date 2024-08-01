package com.scaler.productservice25july.repositories;

import com.scaler.productservice25july.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
