package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.User;
import com.restaurantpos.demo.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements GenericCrudService<User, String> {

    @Autowired
    protected UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
}