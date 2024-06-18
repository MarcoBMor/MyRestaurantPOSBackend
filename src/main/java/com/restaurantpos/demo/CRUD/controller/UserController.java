package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.User;
import com.restaurantpos.demo.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends GenericCrudController<User, String>{

    @Autowired
    public UserController(UserService service) {
        super(service);
    }

}
