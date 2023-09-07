package lesson_1;
public class Chocolate extends Product {
    protected double calories;

    public Chocolate(String name, String brand, double price, double calories) {
        super(name, brand, price);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

//    public void setCalories(int calories) {
//        this.calories = calories;
//    }
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - с: %.2f", this.name, this.brand, this.price, this.calories);
    }
}