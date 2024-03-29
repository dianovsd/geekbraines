package lesson_1;

public class BottleOfWater extends Product {
    private double volume;

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f - v: %.2f", this.name, this.brand, this.price, this.volume);
    }
}

