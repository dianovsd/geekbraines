import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.println("Выберите операцию:");
        System.out.println("1 - сложить");
        System.out.println("2 - умножить");
        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println(num1 + num2);
        } else if (operation == 2) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Неверная операция");
        }
    }
}
