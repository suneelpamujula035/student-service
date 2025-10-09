package com.student.entity;

public class Bat {
    private String name;

    @Override
    public String toString() {
        return "Bat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bat(String name) {
        this.name = name;
    }

    public Bat() {
    }
}
