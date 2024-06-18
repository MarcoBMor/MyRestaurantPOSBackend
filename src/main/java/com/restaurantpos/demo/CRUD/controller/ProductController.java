package com.restaurantpos.demo.CRUD.controller;

import com.restaurantpos.demo.CRUD.entity.Category;
import com.restaurantpos.demo.CRUD.entity.Product;
import com.restaurantpos.demo.CRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController extends GenericCrudController<Product, String> {

    @Autowired
    public ProductController(ProductService service) {
        super(service);
    }

    @Autowired
    protected ProductService productService;

}

