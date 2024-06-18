package com.restaurantpos.demo.CRUD.repository;

import com.restaurantpos.demo.CRUD.entity.Table;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends MongoRepository<Table, String> {

}
