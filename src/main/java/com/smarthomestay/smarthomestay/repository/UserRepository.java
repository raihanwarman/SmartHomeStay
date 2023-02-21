package com.smarthomestay.smarthomestay.repository;

import com.smarthomestay.smarthomestay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
