import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class ToyStore {
    List<Toy> toys = new ArrayList<>();
    Queue<Toy> prizeToys = new LinkedList<>();
    int drawCount = 0;

    void addToy(Toy toy) {
        toys.add(toy);
    }

    void organizeDraw() throws IOException {
        drawCount++;
        BufferedWriter writer = new BufferedWriter(new FileWriter("prizes.txt", true));
        writer.append("Розыгрыш #" + drawCount + "\n");
        writer.close();

        Random rand = new Random();
        double p = rand.nextDouble() * 100.0;
        double cumulativeProbability = 0.0;
        for (Toy toy : toys) {
            cumulativeProbability += toy.weight;
            if (p <= cumulativeProbability) {
                prizeToys.add(toy);
                toy.quantity--;
                break;
            }
        }
    }

    void getPrizeToy() throws IOException {
        Toy toy = prizeToys.poll();
        BufferedWriter writer = new BufferedWriter(new FileWriter("prizes.txt", true));
        writer.append("Prize Toy: " + toy.name + "\n");
        writer.close();
    }

    void displayToys() {
        System.out.println("Toys in the store:");
        for (Toy toy : toys) {
            System.out.println("ID: " + toy.id + ", Name: " + toy.name + ", Quantity: " + toy.quantity + ", Weight: " + toy.weight);
        }
    }
}
