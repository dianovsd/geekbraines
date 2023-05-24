package Final;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static Final.Notebook.*;


public class main {

    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("ASUS pantera", 16, 512, "Windows", "Black"));
        notebooks.add(new Notebook("Apple Macbook", 8, 256, "MacOS", "White"));
        notebooks.add(new Notebook("Acer Inspire", 4, 256, "Windows", "Silver"));
        notebooks.add(new Notebook("HP Elitebook 840", 16, 512, "Windows", "Red"));
        notebooks.add(new Notebook("Dell 2344", 8, 1024, "Linux", "Blue"));
        notebooks.add(new Notebook("Dell 34243", 4, 256, "Linux", "Gold"));
        notebooks.add(new Notebook("ASUS Golg", 8, 512, "Windows", "Black"));
        notebooks.add(new Notebook("Apple Macbook Pro", 16, 1024, "MacOS", "White"));
        notebooks.add(new Notebook("Acer Inspire 3454", 4, 512, "Linux", "Silver"));
        notebooks.add(new Notebook("HP Elitebook 850", 16, 512, "Windows", "Black"));
        notebooks.add(new Notebook("Dell 23344", 8, 1024, "Linux", "Blue"));
        notebooks.add(new Notebook("Dell 342453", 4, 256, "Windows", "Gold"));

        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            System.out.println("Выберете что вы хотите: \n" +
                    "1) Вывести все ноутбуки которые удовлетворяют минимальным требованиям\n" +
                    "2) Вывести все ноутбуки которые удовлетворяют конкретному параметру\n" +
                    "3) Вывести список всех ноутбуков на складе\n" +
                    "4) Ничего не хочу, закройся уже\n\n" +
                    "Выберете и введите цифру");

            value = scanner.nextInt();

            switch (value) {
                case 1:
                    filterNotebooksByMinValues(notebooks);
                    break;
                case 2:
                    filterNotebooks(notebooks);
                    break;
                case 3:
                    printNotebooks(notebooks);
                    break;
                case 4:
                    System.out.println("OK");;
                    break;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
        while (value != 4);

    }}

