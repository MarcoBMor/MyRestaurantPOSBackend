package com.restaurantpos.demo.CRUD.repository;

import com.restaurantpos.demo.CRUD.entity.ExtraGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraGroupRepository extends MongoRepository<ExtraGroup, String> {
}
