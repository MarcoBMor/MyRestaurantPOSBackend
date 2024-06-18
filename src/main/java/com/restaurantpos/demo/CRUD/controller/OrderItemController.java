package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.OrderItem;
import com.restaurantpos.demo.CRUD.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class OrderItemController extends GenericCrudController<OrderItem, String>{

    @Autowired
    public OrderItemController(OrderItemService service) {
        super(service);
    }

}
