package observer;

public interface Publisher {

    void sendOffer(String companyName, int salary, Position position);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);


}
