package Homework;

public abstract class Animal {
    public String name;
    protected int appetite;
    protected boolean satisfied;

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }
    public boolean isSatisfied() {
        return satisfied;
    }
    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }
    public boolean eat(Plate plate) {
        return plate.getFood() >= appetite;
    }
}

