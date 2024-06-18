package com.restaurantpos.demo.CRUD.repository;

import com.restaurantpos.demo.CRUD.entity.ExtraOption;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraOptionRepository extends MongoRepository<ExtraOption,String> {

}
