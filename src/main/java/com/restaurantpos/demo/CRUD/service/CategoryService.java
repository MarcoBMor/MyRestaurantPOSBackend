package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.Category;
import com.restaurantpos.demo.CRUD.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements GenericCrudService<Category, String> {

    @Autowired
    protected CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(String id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category entity) {
        return categoryRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        categoryRepository.deleteById(id);
    }
}
