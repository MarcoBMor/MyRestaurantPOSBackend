package com.restaurantpos.demo.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "orders")
public class Order {

    public enum OrderStatus {
        to_do,
        completed
    }

    @Id
    private String id;

    @DBRef
    private Table table;

    @DBRef
    private User waiter;

    private LocalDateTime orderTime;
    private OrderStatus status;

    public Order() {

    }

    public Order(String id, Table table, User waiter, LocalDateTime orderTime, OrderStatus status) {
        this.id = id;
        this.table = table;
        this.waiter = waiter;
        this.orderTime = orderTime;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public User getWaiter() {
        return waiter;
    }

    public void setWaiter(User waiter) {
        this.waiter = waiter;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
