package com.student.entity;

public class Coffee {
    private String name;

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coffee(String name) {
        this.name = name;
    }

    public Coffee() {
    }
}
