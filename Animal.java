package com.syntax.class21;

public class Animal {
    String nane;
    String color;
    String breed;
    int age;

    public Animal(String nane, String color, String breed, int age) {
        this.nane = nane;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public Animal(String nane, String color, String breed) {
        this.nane = nane;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name " + nane + " color " + breed + " age " + age);
    }
  }

    class Dog extends Animal {
    public Dog(String name, String color, String breed, int age) {
        super(name, color, breed, age);

    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed, int age){

        super(name, color, breed, age);
    }
}


