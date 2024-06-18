package com.restaurantpos.demo.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "order_items")
public class OrderItem {

    @Id
    private String id;

    @DBRef
    private Product product;

    @DBRef
    private List<ExtraOption> extra;

    @DBRef
    private Order order;

    private int quantity;
    private double unitPrice;
    private String comments;

    public OrderItem() {

    }

    public OrderItem(String id, Product product, List<ExtraOption> extra, Order order, int quantity, double unitPrice, String comments) {
        this.id = id;
        this.product = product;
        this.extra = extra;
        this.order = order;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<ExtraOption> getExtra() {
        return extra;
    }

    public void setExtra(List<ExtraOption> extra) {
        this.extra = extra;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
