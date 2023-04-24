package Java.Homework.Seminar_2;

public class task {

    public static void main(String[] args) {
        System.out.println(findJewelsInStones("aB", "aaaAbbbB"));
    }
    
    public static String findJewelsInStones(String jewels, String stones) {
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