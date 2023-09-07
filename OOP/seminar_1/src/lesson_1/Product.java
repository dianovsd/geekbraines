package lesson_1;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.checkName(name);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.checkBrand(brand);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 100.0) {
            throw new RuntimeException("Некорректная цена товара.");
        } else {
            this.price = price;
        }
    }

    public Product() {
        this("Noname");
    }

    public Product(String name) {
        this(name, "Noname");
    }

    public Product(String name, String brand) {
        this(name, brand, 100.0);
    }

    public Product(String name, String brand, double price) {
        if (price < 100.0) {
            throw new RuntimeException("Некорректная цена товара.");
        } else {
            this.price = price;
            this.checkName(name);
            this.checkBrand(brand);
        }
    }

    private void checkName(String name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        } else {
            this.name = "Noname";
        }

    }

    private void checkBrand(String brand) {
        if (brand != null && brand.length() >= 3) {
            this.brand = brand;
        } else {
            this.brand = "Noname";
        }

    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", this.name, this.brand, this.price);
    }
}
