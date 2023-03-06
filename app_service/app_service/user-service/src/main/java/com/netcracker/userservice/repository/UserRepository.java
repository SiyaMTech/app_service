package com.netcracker.userservice.repository;

import com.netcracker.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
