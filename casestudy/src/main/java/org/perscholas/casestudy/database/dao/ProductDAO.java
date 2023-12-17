package org.perscholas.casestudy.database.dao;

import org.perscholas.casestudy.database.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
    Product findById(Integer id);

    @Query("SELECT p FROM Product p WHERE LOWER(p.productCategory) LIKE LOWER(concat('%', :productCategory, '%'))")
    List<Product> findByProductCategory(String productCategory);
}
