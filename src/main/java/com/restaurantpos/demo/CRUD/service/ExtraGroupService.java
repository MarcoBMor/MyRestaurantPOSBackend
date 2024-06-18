package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.ExtraGroup;
import com.restaurantpos.demo.CRUD.repository.ExtraGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExtraGroupService implements GenericCrudService<ExtraGroup, String> {

    @Autowired
    protected ExtraGroupRepository extraGroupRepository;

    @Override
    public List<ExtraGroup> findAll() {
        return extraGroupRepository.findAll();
    }

    @Override
    public Optional<ExtraGroup> findById(String id) {
        return extraGroupRepository.findById(id);
    }

    @Override
    public ExtraGroup save(ExtraGroup entity) {
        return extraGroupRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        extraGroupRepository.deleteById(id);
    }
}
