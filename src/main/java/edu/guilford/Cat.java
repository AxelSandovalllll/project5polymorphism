package edu.guilford;

// subclass called Cat that extends Pet
public class Cat extends Pet {
    private int lives;

    // create a constructor for Cat that takes in the name, age, and color of the
    // cat and calls the super constructor with those values, and also sets the
    // breed of the cat
    public Cat(String name, int age, String color, int lives) {
        super(name, age, color);
        this.lives = lives;
    }

    // getter method for breed
    public int getLives() {
        return lives;
    }

    // override the speak method to return "meow"
    @Override
    public String speak() {
        return "meows";
    }

    // override the doPetThings method to print "I'm a cat and I'm doing cat
    // things!"
    @Override
    public void doPetThings() {
        System.out.println("I'm a cat and I'm doing cat things!");
    }
}