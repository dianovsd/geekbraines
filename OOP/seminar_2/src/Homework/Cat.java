package Homework;
public class Cat extends Animal {
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satisfied = false;
    }

    public boolean eat(Plate plate) {
        if (this.isSatisfied()) {
            System.out.println(name + " не хочет есть, он уже сыт");
            return false; }
            if (super.eat(plate)) {
                plate.setFood(plate.getFood() - appetite);
                System.out.println(name + " наелся и остался доволен");
                System.out.println("Осталось " + plate.getFood() + " грамм еды");
                this.setSatisfied(true); // устанавливаем сытость в true, если кот наелся
                return true;
            } else {
                System.out.println(name + " мало еды, котик не доволен ");
                this.setSatisfied(false); // оставляем сытость в false, если еды не хватило
                return false;
            }
        }
    }