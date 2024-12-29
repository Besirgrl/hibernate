package com.tpe.hb.basicannotations;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {

    @Id

    private String name;
    private int id;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }
}
