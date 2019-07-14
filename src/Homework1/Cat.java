package Homework1;

import java.util.Random;

public class Cat {

    private String name;
    int age;
    boolean isAlive;
    boolean isFull;

    public Cat(String newName) {

        Random randomiser = new Random();
        int randomNumber = randomiser.nextInt(20);
        age = randomNumber;

        if (age >= 15) {
            isAlive = false;
        } else {
            isAlive = true;
        }

        isFull = false;

        name = newName;
    }

    public void feedCat() {
        isFull = true;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(age);

        System.out.println("Is Alive: " + isAlive);

        if (isAlive) {
            System.out.println("Is full: " + isFull);  // "is full: " + "true"     prinditakse: "is full: true"
        }

        System.out.println("--------------------------------");
    }


}
