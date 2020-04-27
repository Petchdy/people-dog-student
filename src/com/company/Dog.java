package com.company;

public class Dog {
    private String name;
    private String breed;
    private boolean sex;
    private int age;
    private String colour;

    public Dog(String name, String breed, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = true;
        this.age = 10;
        this.colour = colour;
    }

    public Dog(String name, String breed, boolean sex, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = 10;
        this.colour = colour;
    }

    public Dog(String name, String breed, Boolean sex, int age, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.colour = colour;
        bark();
    }

    public void introduce() {
        System.out.println("I'm " + name);
    }

    public void bark() {
        System.out.println("I'm barking");
    }

    public Boolean sameBreed(String breed) {
        if (this.breed == breed) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public Boolean getsex(){
        return sex;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public String getColour(){
        return colour;
    }

}

