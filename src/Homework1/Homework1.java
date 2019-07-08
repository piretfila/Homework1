package Homework1;

public class Homework1 {


    public static void main(String[] args) {
        Ball punanePall = new Ball();
        punanePall.changeColor(Ball.Color.Red);
        Ball sininePall = new Ball();
        sininePall.changeColor(Ball.Color.Blue);

        System.out.println(punanePall.color);
        System.out.println(sininePall.color);
    }
}