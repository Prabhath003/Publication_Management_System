package com.swe.pms.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import com.swe.pms.domain.User;

// public class UserRepository extends JpaRepository<User, Long>{
//     User findByUsername(String username);
// }

public class UserRepository extends JpaRepositoriesAutoConfiguration<User, Long> {
    User findUserByUsername(String username);
}
