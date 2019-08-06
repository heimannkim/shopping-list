package org.launchcode.shoppinglist.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class User {
    @GeneratedValue
    @Id
    Integer id;

    @Column(unique = true)
    @NotNull
    String username;

    @Column
    @NotNull
    String password;

    public User() {
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
