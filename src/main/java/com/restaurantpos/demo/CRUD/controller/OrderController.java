package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.Order;
import com.restaurantpos.demo.CRUD.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController extends GenericCrudController<Order, String>{

    @Autowired
    public OrderController(OrderService service) {
        super(service);
    }

}
