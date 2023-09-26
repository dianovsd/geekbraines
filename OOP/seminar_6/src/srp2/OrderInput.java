package srp2;

import java.util.Scanner;

class OrderInput {
    private Scanner in;

    public OrderInput() {
        in = new Scanner(System.in);
    }

    public Order inputFromConsole(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));

        return new Order(clientName, product, qnt, price);
    }

    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }
}
