package com.example.demo.Manager;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserManager extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
