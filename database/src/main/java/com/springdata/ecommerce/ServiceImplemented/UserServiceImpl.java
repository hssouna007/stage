package com.springdata.ecommerce.ServiceImplemented;

import com.springdata.ecommerce.models.User;
import com.springdata.ecommerce.repository.UserRepository;
import com.springdata.ecommerce.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository _userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        _userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        return this._userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(UUID id) {
        return null;
    }

    @Override
    public User getUserById(UUID id) {
        return _userRepository.findById(id).orElseThrow();

    }
}
