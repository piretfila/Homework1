package Homework1;

import java.util.Random;

public class Cat {

    String name;
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
}
