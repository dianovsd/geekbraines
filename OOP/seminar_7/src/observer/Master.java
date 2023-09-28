package observer;

import java.util.List;

public class Master implements Observer {

    private String name;
    private int salary = 80000;
    private Position position;

    public Master(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void receiveOffer(String nameCompany, int salary, Position position) {
        if (this.position == position && this.salary <= salary) {
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }


}
