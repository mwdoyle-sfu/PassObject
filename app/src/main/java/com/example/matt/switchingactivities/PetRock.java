package com.example.matt.switchingactivities;

/**
 * Created by Matt on 2018-01-18.
 */

public class PetRock {
    private String name;
    private int age;

    public PetRock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
