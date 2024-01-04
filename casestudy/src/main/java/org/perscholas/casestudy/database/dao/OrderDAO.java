package org.perscholas.casestudy.database.dao;

import org.perscholas.casestudy.database.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {
    Order findById(Integer id);
}
