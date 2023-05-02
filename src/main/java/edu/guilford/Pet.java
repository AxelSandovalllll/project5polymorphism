package edu.guilford;

//create an abstract super class called Pet with the following attributes: name, age, and color
public abstract class Pet implements Comparable<Pet> {
    protected String name;
    protected int age;
    protected String color;

    // Pet constructor
    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // getter methods; no setter methods since we don't want to change the name,
    // age, or color of a pet
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // abstract method to be implemented by subclasses
    public abstract String speak();

    // method that demonstrates pet behavior
    public void doPetThings() {
        System.out.println("I'm a pet and I'm doing pet things!");
    }

    // compareTo method to compare pets by age
    @Override
    public int compareTo(Pet other) {
        return Integer.compare(this.age, other.age);
    }
}
