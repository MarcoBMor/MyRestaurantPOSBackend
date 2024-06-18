package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.Order;
import com.restaurantpos.demo.CRUD.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements GenericCrudService<Order, String> {

    @Autowired
    protected OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order entity) {
        return orderRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        orderRepository.deleteById(id);
    }
}
