package com.swe.pms.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import com.swe.pms.domain.User;

public class UserRepository extends JpaRepositoriesAutoConfiguration {
    User findByUsername(String username) {
        
    }
}
