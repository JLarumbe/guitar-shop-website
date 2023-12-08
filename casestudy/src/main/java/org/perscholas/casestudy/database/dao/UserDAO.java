package org.perscholas.casestudy.database.dao;

import org.perscholas.casestudy.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findById(Integer id);

    User findByEmailIgnoreCase(String email);
}
