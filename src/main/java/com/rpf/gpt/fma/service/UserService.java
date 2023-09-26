package com.rpf.gpt.fma.service;

import com.rpf.gpt.fma.entity.User;
import com.rpf.gpt.fma.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        if (userRepository.existsById(id)) {
            updatedUser.setUser_id(id);
            return userRepository.save(updatedUser);
        }
        return null; // Handle error when the user with the given id does not exist
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
