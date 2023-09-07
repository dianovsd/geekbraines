package lesson_1;

import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        Iterator var4 = this.products.iterator();

        while(var4.hasNext()) {
            Product product = (Product)var4.next();
            if (product instanceof BottleOfWater bottleOfWater) {
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }

        return null;
    }
    public Chocolate getChocolate(String name,String brand, int calories) {
        Iterator var3 = this.products.iterator();

        while(var3.hasNext()) {
            Product product = (Product)var3.next();
            if (product instanceof Chocolate chocolate) {
                if (chocolate.getBrand().equals(brand) && chocolate.getCalories() == calories) {
                    return chocolate;
                }
            }
        }

        return null;

    }
}
