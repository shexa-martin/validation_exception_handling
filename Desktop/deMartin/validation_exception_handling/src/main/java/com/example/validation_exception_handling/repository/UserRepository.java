package com.example.validation_exception_handling.repository;

import com.example.validation_exception_handling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
