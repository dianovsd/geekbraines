package Java.Homework.Seminar_2;

public class task_2 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {2, 1, 0};
        System.out.println(shuffleString(s, index));
    }

    public static String shuffleString(String s, int[] index) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[index[i]] = s.charAt(i);
        }
        return new String(result);
    }
}