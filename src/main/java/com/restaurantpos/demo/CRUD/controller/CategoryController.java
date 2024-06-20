package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.Category;
import com.restaurantpos.demo.CRUD.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController extends GenericCrudController<Category, String>{

    @Autowired
    public CategoryController(CategoryService service) {
        super(service);
    }

}
