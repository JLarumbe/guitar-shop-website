package org.perscholas.casestudy.database.dao;

import org.perscholas.casestudy.database.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
    Product findById(Integer id);

    Product findByProductCategory(String productCategory);
}
