package com.scaler.productservice25july.repositories;

import com.scaler.productservice25july.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Update is also done using save()
    // If the product you try to save has an ID:
    // JPA will see if a product with that ID exists:
    // If no -> Insert
    // If yes -> Update
    @Override
    Product save(Product p);

    @Override
    void delete(Product entity);
}
