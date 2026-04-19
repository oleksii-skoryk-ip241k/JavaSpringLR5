package com.ip241k.skoryk.repository;

import com.ip241k.skoryk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
