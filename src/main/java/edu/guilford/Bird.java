package edu.guilford;

public class Bird extends Pet {
    private String species;

    // create a constructor for bird that takes in the name, age, and color of the
    // bird and calls the super constructor with those values, and also sets the
    // species of the bird
    public Bird(String name, int age, String color, String species) {
        super(name, age, color);
        this.species = species;
    }

    // getter method for species
    public String getspecies() {
        return species;
    }

    // override the speak method to return "chirp"
    @Override
    public String speak() {
        return "chirps";
    }

    // override the doPetThings method to print "I'm a bird and I'm doing bird
    // things!"
    @Override
    public void doPetThings() {
        System.out.println("I'm a bird and I'm doing bird things!");
    }
}
