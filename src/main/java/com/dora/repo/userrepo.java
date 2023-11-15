package com.dora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dora.entity.User;

public interface userrepo extends JpaRepository<User, Long> {
 User findByEmail(String email);
}

