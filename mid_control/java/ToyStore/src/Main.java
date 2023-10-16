import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();
        store.addToy(new Toy(1, "Teddy Bear", 10, 20.0));
        store.addToy(new Toy(2, "Doll", 15, 30.0));
        store.addToy(new Toy(3, "Car", 20, 50.0));

        store.displayToys();

        for (int i = 0; i < 5; i++) {
            store.organizeDraw();
            store.getPrizeToy();
        }

        store.displayToys();
    }
}