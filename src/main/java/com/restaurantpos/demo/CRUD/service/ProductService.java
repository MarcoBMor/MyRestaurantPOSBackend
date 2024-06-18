package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.Product;
import com.restaurantpos.demo.CRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements GenericCrudService<Product, String> {


    @Autowired
    protected ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
}