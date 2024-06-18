package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.OrderItem;
import com.restaurantpos.demo.CRUD.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService implements GenericCrudService<OrderItem, String> {

    @Autowired
    protected OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public Optional<OrderItem> findById(String id) {
        return orderItemRepository.findById(id);
    }

    @Override
    public OrderItem save(OrderItem entity) {
        return orderItemRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        orderItemRepository.deleteById(id);
    }
}
