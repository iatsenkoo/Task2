package org.example.org.demo;

import java.io.Serializable;

public class BigObject implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
