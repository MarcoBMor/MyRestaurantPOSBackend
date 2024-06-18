package com.restaurantpos.demo.CRUD.service;

import com.restaurantpos.demo.CRUD.entity.ExtraOption;
import com.restaurantpos.demo.CRUD.repository.ExtraOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExtraOptionService implements GenericCrudService<ExtraOption, String> {

    @Autowired
    protected ExtraOptionRepository extraOptionRepository;

    @Override
    public List<ExtraOption> findAll() {
        return extraOptionRepository.findAll();
    }

    @Override
    public Optional<ExtraOption> findById(String id) {
        return extraOptionRepository.findById(id);
    }

    @Override
    public ExtraOption save(ExtraOption entity) {
        return extraOptionRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        extraOptionRepository.deleteById(id);
    }
}