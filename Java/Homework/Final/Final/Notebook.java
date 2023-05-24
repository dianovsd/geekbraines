package Final;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Notebook {

    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(String name, int ram, int hdd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public static void filterNotebooks(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(1, "ram");
        criteriaMap.put(2, "hdd");
        criteriaMap.put(3, "os");
        criteriaMap.put(4, "color");

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        for (Map.Entry<Integer, String> entry : criteriaMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        int criteria = scanner.nextInt();
        String fieldName = criteriaMap.get(criteria);

        System.out.println("Введите значение для фильтрации:");
        String value = scanner.next();

        for (Notebook notebook : notebooks) {
            try {
                Field field = Notebook.class.getDeclaredField(fieldName);
                field.setAccessible(true);
                if (field.get(notebook).toString().equals(value)) {
                    System.out.println(notebook.getName());
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void filterNotebooksByMinValues(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(1, "ram");
        criteriaMap.put(2, "hdd");

        Map<String, Integer> minValues = new HashMap<>();

        for (Map.Entry<Integer, String> entry : criteriaMap.entrySet()) {
            System.out.println("Введите минимальное значение для " + entry.getValue() + ":");
            int minValue = scanner.nextInt();
            minValues.put(entry.getValue(), minValue);
        }

        for (Notebook notebook : notebooks) {
            boolean match = true;
            for (Map.Entry<String, Integer> entry : minValues.entrySet()) {
                try {
                    Field field = Notebook.class.getDeclaredField(entry.getKey());
                    field.setAccessible(true);
                    int fieldValue = (int) field.get(notebook);
                    if (fieldValue < entry.getValue()) {
                        match = false;
                        break;
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            if (match) {
                System.out.println(notebook.getName());
            }
        }
    }

    public static void printNotebooks(Set<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println("Название: " + notebook.getName());
            System.out.println("ОЗУ: " + notebook.getRam());
            System.out.println("ЖД: " + notebook.getHdd());
            System.out.println("ОС: " + notebook.getOs());
            System.out.println("Цвет: " + notebook.getColor());
            System.out.println();
        }
    }
}