package com.restaurantpos.demo.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "extra_groups")
public class ExtraGroup {

    @Id
    private String id;

    private String name;
    private List<ExtraOption> options;

    public ExtraGroup() {

    }

    public ExtraGroup(String id, String name, List<ExtraOption> options) {
        this.id = id;
        this.name = name;
        this.options = options;
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

    public List<ExtraOption> getOptions() {
        return options;
    }

    public void setOptions(List<ExtraOption> options) {
        this.options = options;
    }
}
