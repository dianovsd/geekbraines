package Seminar_1;

import java.util.Scanner;

public class snail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите высоту шеста: ");
        String word = s.nextLine();
        int h = Integer.parseInt(word);
        System.out.println("Введите вверх: ");
        String word2 = s.nextLine();
        int a = Integer.parseInt(word2);
        System.out.println("Введите вниз: ");
        String word3 = s.nextLine();
        int b = Integer.parseInt(word3);

        int start = 0;
        int counter = 1;

        while (start + a <= h) {
            counter ++;
            start = start + a - b;
        }
        System.out.println(counter);
    }
    
}
