import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int triangularNumber = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
            factorial *= i;
        }
        System.out.println("n-ое треугольное число: " + triangularNumber);
        System.out.println("n!: " + factorial);
    }
}
