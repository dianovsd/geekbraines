
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> map;

    public PhoneBook() {
        map = new HashMap<>();
    }

    public void addEntry(String name, String phone) {
        if (map.containsKey(name)) {
            map.get(name).add(phone);
        } 
        else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            map.put(name, phones);
        }
    }

    public ArrayList<String> findEntry(String name) {
        return map.getOrDefault(name, null);
    }

    public void saveToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        for (String name : map.keySet()) {
            writer.write(name + ":");
            for (String phone : map.get(name)) {
                writer.write(phone + ",");
            }
            writer.write("\n");
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить запись");
            System.out.println("2. Найти запись");
            System.out.println("3. Сохранить в файл");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                System.out.println("Введите номер телефона:");
                String phone = scanner.nextLine();
                phoneBook.addEntry(name, phone);
            } 
            else if (choice == 2) {
                System.out.println("Введите имя для поиска:");
                String name = scanner.nextLine();
                ArrayList<String> phones = phoneBook.findEntry(name);
                if (phones != null) {
                    System.out.println("Номера телефонов для " + name + ":");
                    for (String p : phones) {
                        System.out.println(p);
                    }
                } 
                else {
                    System.out.println("Нет записей для " + name);
                }
            } 
            else if (choice == 3) {
                System.out.println("Введите имя файла для сохранения:");
                String fileName = scanner.nextLine();
                phoneBook.saveToFile(fileName);
            } 
            else if (choice == 4) {
                break;
            } 
            else {
                System.out.println("Неверный выбор.");
            }
        }
    }
}