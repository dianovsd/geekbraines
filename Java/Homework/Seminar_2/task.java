package Java.Homework.Seminar_2;
public class task {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
    
    }
    
    public String findJewelsInStones(String jewels, String stones) {
        int[] count = new int[58];
        for (char c : stones.toCharArray()) {
            count[c - 'A']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : jewels.toCharArray()) {
            sb.append(c).append(count[c - 'A']);
        }
        return sb.toString();
    }
    }