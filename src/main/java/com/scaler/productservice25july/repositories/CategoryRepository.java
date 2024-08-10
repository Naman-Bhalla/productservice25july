package com.scaler.productservice25july.repositories;

import com.scaler.productservice25july.models.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    Optional<Category> findByName(String name);

//    List<Category> findByIdGreaterThanAndNameGreaterThan(
//            Long id, String name);

    Category save(Category category);
}
