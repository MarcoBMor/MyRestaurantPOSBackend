package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.ExtraGroup;
import com.restaurantpos.demo.CRUD.service.ExtraGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extra-groups")
public class ExtraGroupController extends GenericCrudController<ExtraGroup, String>{

    @Autowired
    public ExtraGroupController(ExtraGroupService service) {
        super(service);
    }

}
