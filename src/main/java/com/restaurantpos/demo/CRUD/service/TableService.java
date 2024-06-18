package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.Table;
import com.restaurantpos.demo.CRUD.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableService implements GenericCrudService<Table, String> {


    @Autowired
    protected TableRepository tableRepository;

    @Override
    public List<Table> findAll() {
        return tableRepository.findAll();
    }

    @Override
    public Optional<Table> findById(String id) {
        return tableRepository.findById(id);
    }

    @Override
    public Table save(Table entity) {
        return tableRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        tableRepository.deleteById(id);
    }
}
