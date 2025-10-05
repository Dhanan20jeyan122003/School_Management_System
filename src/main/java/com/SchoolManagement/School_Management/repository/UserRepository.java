package com.SchoolManagement.School_Management.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.School_Management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}