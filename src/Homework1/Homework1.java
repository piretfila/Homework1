package Homework1;

public class Homework1 {


    public static void main(String[] args) {
        Ball punanePall = new Ball();
        punanePall.changeColor(Ball.Color.Red);
        Ball sininePall = new Ball();
        sininePall.changeColor(Ball.Color.Blue);

        System.out.println(punanePall.color);
        System.out.println(sininePall.color);

        hello();
        hello();

        Cat kass = new Cat("Juss");
        Cat manni = new Cat("Manni");
        printCatDetails(kass);
        printCatDetails(manni);
        printCatDetails(new Cat("Bosse"));
    }

    public static void hello() {
        System.out.println("Hello" + "Piret");
    }

    public static void printCatDetails(Cat cat) {
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println("Is full: " + cat.isFull);  // "is full: " + "true"     prinditakse: "is full: true"
        System.out.println("Is Alive: " + cat.isAlive);
    }

}