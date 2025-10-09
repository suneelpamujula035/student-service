package com.student.entity;

public class Rat {
    private String name;

    @Override
    public String toString() {
        return "Rat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rat(String name) {
        this.name = name;
    }

    public Rat() {
    }
}
