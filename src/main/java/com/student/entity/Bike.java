package com.student.entity;

public class Bike {
    private String name;

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bike() {
    }

    public Bike(String name) {
        this.name = name;
    }
}
