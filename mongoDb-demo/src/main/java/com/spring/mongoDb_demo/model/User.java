package com.spring.mongoDb_demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;

@Document(collection = "users")   // Document: mongo db anotasyonu, verileri collection şeklinde tutmamıza yarar
public class User {
    @Id
    private String id;
    // user oluştururken id vermesek de mongo otomatikmen bir id veriyor

    private String name;
    private String surname;
    private Map<String, String> attribute;

    public User() {
    }

    public User(String id, String name, String surname, Map<String, String> attribute) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.attribute = attribute;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<String, String> getAttribute() {
        return attribute;
    }

    public void setAttribute(Map<String, String> attribute) {
        this.attribute = attribute;
    }
}
