package observer;

public class Student implements Observer{

    private String name;
    private int salary = 2000;
    private Position position;

    public Student(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Position position) {
        if (this.position == position && this.salary <= salary) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
