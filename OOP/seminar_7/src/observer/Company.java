package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private Position position;

    public Company(String name, Publisher jobAgency, int maxSalary, Position position) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.position = position;
    }
//    public void setVacancy(Position position) {
//        this.position = position;
//    }
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, position);
    }


}
