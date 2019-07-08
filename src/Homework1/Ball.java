package Homework1;

import java.util.Random;

public class Ball {

    // Define color
    enum Color {
        Green,
        Blue,
        Red
    }

    // Data related to a ball
    public Color color;

    public Ball() {
        // Randomize a number from 0 to 2
        Random randomiser = new Random();
        int randomNumber = randomiser.nextInt(3);

        // Decide which color the ball will be
        if (randomNumber == 0) {
            color = Color.Red;
        } else if (randomNumber == 1) {
            color = Color.Blue;
        } else {
            color = Color.Green;
        }

        printcolour();
    }

    public void changeColor(Color newColor) {
        color = newColor;
    }

    public void printcolour() {
        System.out.println(color);
    }
}
