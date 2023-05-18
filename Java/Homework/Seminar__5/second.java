import java.util.ArrayList;
import java.util.TreeMap;

public class second {
  public static void main(String[] args) {
    ArrayList<String> employees = new ArrayList<>();
    employees.add("Иван Иванов");
    employees.add("Светлана Петрова");
    employees.add("Кристина Белова");
    employees.add("Анна Мусина");
    employees.add("Анна Крутова");
    employees.add("Иван Юрин");
    employees.add("Петр Лыков");
    employees.add("Павел Чернов");
    employees.add("Петр Чернышов");
    employees.add("Мария Федорова");
    employees.add("Марина Светлова");
    employees.add("Мария Савина");
    employees.add("Мария Рыкова");
    employees.add("Марина Лугова");
    employees.add("Анна Владимирова");
    employees.add("Иван Мечников");
    employees.add("Петр Петин");
    employees.add("Иван Ежов");

    TreeMap<String, Integer> names = new TreeMap<>();

    for (String employee : employees) {
      String name = employee.split(" ")[0];
      if (names.containsKey(name)) {
        names.put(name, names.get(name) + 1);
      } else {
        names.put(name, 1);
      }
    }

    System.out.println("Повторяющиеся имена с количеством повторений:");
    for (String name : names.descendingKeySet()) {
      System.out.println(name + " - " + names.get(name));
    }
  }
}