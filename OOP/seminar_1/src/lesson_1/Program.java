package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
//        Product product1 = new Product();
//        System.out.println(product1.displayInfo());
//        Product product2 = new Product((String)null, "Brand2", 300.0);
//        System.out.println(product2.displayInfo());
//        product2.setPrice(400.0);
//        double price = product2.getPrice();
//        System.out.println(price);
//        System.out.println(product2.displayInfo());
//        Product product3 = new Product("Product3");
//        System.out.println(product3.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("Бутылка1", "ООО Молоко", 350.0, 1.5, 15);
//        System.out.println(bottleOfMilk1.displayInfo());
        Product bottleOfWater1 = new BottleOfWater("Бутылка c водой", "ООО Источник", 350.0, 1.0);
//        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfWater2 = new BottleOfWater("Бутылка c водой", "ООО Источник", 150.0, 1.5);
        Product bottleOfWater3 = new BottleOfWater("Бутылка c водой", "ООО Источник", 250.0, 2.0);
        Product chocolate1 = new Chocolate("Шоколад", "Milka", 150, 100);
        Product chocolate2 = new Chocolate("Шоколад", "AlpenGold", 100, 80);
        List<Product> products = new ArrayList();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate chocolate = vendingMachine.getChocolate("Шоколад", "Milka", 100 );
        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }

    }
}
