package observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {
    private Position position;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, Position position) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary, position);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
