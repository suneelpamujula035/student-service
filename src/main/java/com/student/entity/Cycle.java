package com.student.entity;

public class Cycle {

    private int id;
    private String name;

    public Cycle() {
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cycle(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
