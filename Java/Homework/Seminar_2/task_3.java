package Java.Homework.Seminar_2;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = scanner.nextLine();
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] allergies = new String[m];
        for (int i = 0; i < m; i++) {
            allergies[i] = scanner.nextLine();
        }
        for (int i = 0; i < m; i++) {
            String[] allergy = allergies[i].split(" - ");
            for (int j = 0; j < n; j++) {
                book[j] = book[j].replaceAll("\\b" + allergy[0] + "\\b", allergy[1]);
                book[j] = book[j].replaceAll("\\b" + allergy[0].substring(0, 1).toUpperCase() + allergy[0].substring(1) + "\\b", allergy[1].substring(0, 1).toUpperCase() + allergy[1].substring(1));
            }
        }
        for (String s : book) {
            System.out.println(s);
        }
    }
}
