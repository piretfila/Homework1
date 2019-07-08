package Homework1;

import java.util.Random;

public class Cat {

    String name;
    int age;
    boolean isAlive;
    boolean isFull;

    public Cat(String newName) {
        isAlive = true;

        Random randomiser = new Random();
        int randomNumber = randomiser.nextInt(10);
        age = randomNumber;

        isFull = false;

        name = newName;
    }

}
