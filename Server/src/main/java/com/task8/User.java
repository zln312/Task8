package com.task8;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 42L;

    int id;

    String name;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
