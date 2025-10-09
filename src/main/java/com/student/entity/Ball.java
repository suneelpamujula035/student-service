package com.student.entity;

public class Ball {
    private String name;

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ball(String name) {
        this.name = name;
    }

    public Ball() {
    }
}
