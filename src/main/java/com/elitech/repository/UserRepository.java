package com.elitech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
