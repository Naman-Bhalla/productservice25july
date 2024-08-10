package com.scaler.productservice25july.repositories;

public interface CustomQueries {
    String GET_PRODUCTS_WITH_SUBCATEGORY_NAME =
            "select * from product p join category c on p.category_id = c.id join subcategory s where s.category_id = c.id";
}

// public class Constants {
//   public static final String GET_PRODUCTS_WITH_SUBCATEGORY_NAME =
//            "select * from product p join category c on p.category_id = c.id join subcategory s where s.category_id = c.id";
// }