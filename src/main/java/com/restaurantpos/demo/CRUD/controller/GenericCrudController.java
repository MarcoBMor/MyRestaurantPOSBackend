package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.service.GenericCrudService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

public abstract class GenericCrudController<T, ID> {

    private final GenericCrudService<T, ID> service;

    public GenericCrudController(GenericCrudService<T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> getById(@PathVariable ID id) {
        return service.findById(id);
    }

    @PostMapping
    public T save(@RequestBody T entity){
        return service.save(entity);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ID id){
        service.deleteById(id);
    }

}
