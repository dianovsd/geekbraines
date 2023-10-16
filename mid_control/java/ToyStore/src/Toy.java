class Toy {
    int id;
    String name;
    int quantity;
    double weight;

    Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    void changeWeight(double newWeight) {
        this.weight = newWeight;
    }
}