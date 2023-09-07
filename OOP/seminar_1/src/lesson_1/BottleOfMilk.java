package lesson_1;

public class BottleOfMilk extends Product {
    private double volume;
    private int fat;

    public BottleOfMilk(String name, String brand, double price, double volume, int fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return this.volume;
    }

    public int getFat() {
        return this.fat;
    }

    public String displayInfo() {
        return String.format("[Бутылка с молоком] %s - %s - %.2f - v: %.2f f: %d", this.name, this.brand, this.price, this.volume, this.fat);
    }
}
