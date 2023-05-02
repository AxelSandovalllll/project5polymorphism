package edu.guilford;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class PetDriver {
    public static void main(String[] args) {

        // instantiate 3 cat objects
        Cat cat1 = new Cat("Fluffy", 5, "black", 9);
        Cat cat2 = new Cat("Mittens", 3, "white", 5);
        Cat cat3 = new Cat("Whiskers", 2, "orange", 7);

        // instantiate 3 dog objects
        Dog dog1 = new Dog("Fido", 4, "brown", "Pitbull");
        Dog dog2 = new Dog("Zuca", 1, "white", "Huskie");
        Dog dog3 = new Dog("Chino", 8, "black", "Chihuahuah");

        // instantiate 3 bird objects
        Bird bird1 = new Bird("Tweety", 2, "yellow", "canary");
        Bird bird2 = new Bird("Polly", 3, "green", "parrot");
        Bird bird3 = new Bird("Tweety", 1, "blue", "bluejay");

        // create an array containing all the instantiated pets
        Pet[] pets = { cat1, cat2, cat3, dog1, dog2, dog3, bird1, bird2, bird3 };

        // use the abstract method for each respective subclass
        // have to use System.out.println() to print the return value of the speak
        // method since method is a public abstract String
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " " + pet.speak());
        }

        // use the doPetThings method for each respective subclass
        // can run method because it is public void
        for (Pet pet : pets) {
            pet.doPetThings();
        }

        // use the compareTo method to compare pets by age
        Arrays.sort(pets);

        System.out.println("\n Sorted pets by age:");
        // Display the sorted pets
        for (Pet pet : pets) {
            if (pet.getAge() == 1) {
                System.out.println(pet.getName() + " is " + pet.getAge() + " year old.");
            } else {
                System.out.println(pet.getName() + " is " + pet.getAge() + " years old.");
            }
        }

    }
}
