package edu.guilford;

public class Dog extends Pet {
    private String breed;

    // create a constructor for Dog that takes in the name, age, and color of the
    // dog and calls the super constructor with those values, and also sets the
    // breed of the dog
    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    // getter method for breed
    public String getbreed() {
        return breed;
    }

    // override the speak method to return "Woof"
    @Override
    public String speak() {
        return "barks";
    }

    // override the doPetThings method to print "I'm a dog and I'm doing dog
    // things!"
    @Override
    public void doPetThings() {
        System.out.println("I'm a dog and I'm doing dog things!");
    }
}
