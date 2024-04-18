package com.swe.pms.service;

import com.swe.pms.domain.User;
import com.swe.pms.exception.UserAlreadyExistsException;

public interface UserService {
    User createUser(User user) throws UserAlreadyExistsException;
    User getUserByUsername(String username);
    // Add other methods for user management functionalities (e.g., update, delete)
}
