package com.example.springbootmongodbexample.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {

    @Id
    private Integer id;
    private String name;
    private Integer distance;

    public Users(Integer id, String name, Integer distance) {
        this.id = id;
        this.name = name;
        this.distance = distance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setInteger(Integer distance) {
        this.distance = distance;
    }
}
