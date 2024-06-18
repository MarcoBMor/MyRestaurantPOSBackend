package com.restaurantpos.demo.CRUD.entity;

import org.springframework.data.annotation.Id;

public class ExtraOption {

    @Id
    private String id;

    private String name;
    private double additionalPrice;

    public ExtraOption() {

    }

    public ExtraOption(String id, String name, double additionalPrice) {
        this.id = id;
        this.name = name;
        this.additionalPrice = additionalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }
}
