package srp2;

public class Program {

    public static void main(String[] args) {
        OrderInput orderInput = new OrderInput();
        OrderSaver orderSaver = new OrderSaver();

        Order order = orderInput.inputFromConsole();
        orderSaver.saveToJson(order);
    }
}