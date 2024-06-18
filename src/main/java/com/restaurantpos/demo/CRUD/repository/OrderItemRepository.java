package com.restaurantpos.demo.CRUD.repository;

import com.restaurantpos.demo.CRUD.entity.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends MongoRepository<OrderItem, String> {
}
