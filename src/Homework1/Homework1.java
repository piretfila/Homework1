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

        Cat kass = createNewAliveCat("Juss");
        printCatDetails(kass);

        Cat manni = createNewAliveCat("Manni");
        printCatDetails(manni);

        manni.printDetails();


    }

    public static Cat createNewAliveCat(String name) {
        Cat aliveCat = new Cat(name);
        aliveCat.isAlive = true;
        aliveCat.feedCat();
        return aliveCat;
    }

    public static Cat createNewDeadCat(String name) {
        Cat deadCat = new Cat(name);
        deadCat.isAlive = false;
        return deadCat;
    }

    public static void hello() {
        System.out.println("Hello" + "Piret");
    }

    public static void printCatDetails(Cat cat) {
        System.out.println(cat.getName());
        System.out.println(cat.age);

        System.out.println("Is Alive: " + cat.isAlive);

        if (cat.isAlive) {
            System.out.println("Is full: " + cat.isFull);  // "is full: " + "true"     prinditakse: "is full: true"
        }

        System.out.println("--------------------------------");
    }
}
