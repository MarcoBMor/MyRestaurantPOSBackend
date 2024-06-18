package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.Table;
import com.restaurantpos.demo.CRUD.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tables")
public class TableController extends GenericCrudController<Table, String>{

    @Autowired
    public TableController(TableService service) {
        super(service);
    }

}
