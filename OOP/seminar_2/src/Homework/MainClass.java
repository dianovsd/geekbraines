package Homework;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 60);
        Cat cat1 = new Cat("Chucha", 20);
        Plate plate = new Plate(60);
        Plate plate1 = new Plate(30);
        plate.info();
        cat.eat(plate);
        cat.eat(plate1);
        cat1.eat(plate1);
        cat1.eat(plate);
    }
}
