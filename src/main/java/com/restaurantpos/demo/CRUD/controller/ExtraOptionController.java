package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.ExtraOption;
import com.restaurantpos.demo.CRUD.service.ExtraOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extra-options")
public class ExtraOptionController extends GenericCrudController<ExtraOption, String>{

    @Autowired
    public ExtraOptionController(ExtraOptionService service) {
        super(service);
    }

}
