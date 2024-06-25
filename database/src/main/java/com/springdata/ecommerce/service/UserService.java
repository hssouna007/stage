package com.springdata.ecommerce.service;

import com.springdata.ecommerce.models.User;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public interface UserService {
    User  createUser(User user);
    User  updateUser(User user);
    User  deleteUser(UUID id);
    User  getUserById(UUID id);
}
