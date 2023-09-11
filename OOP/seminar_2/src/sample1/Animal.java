package sample1;

public abstract class Animal {

    public abstract void voice();
    public void jump(){
        System.out.println("Животное подпрыгнуло.");
    }

}

class Dog extends Animal{

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
}

class Cat extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }
}
