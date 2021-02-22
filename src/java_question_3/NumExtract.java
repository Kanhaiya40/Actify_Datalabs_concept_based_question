package java_question_3;

import java.util.ArrayList;

public class NumExtract {

    public static void main(String[] args) {
        String input = "asdsdgbdfgjdfgn6sbdfh3hhj5j1jh5j66asryuop8ng2nb7mbb8k;0++)O)";
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                StringBuilder out = new StringBuilder();
                while (Character.isDigit(input.charAt(i))) {
                    out.append(input.charAt(i));
                    i++;
                }
                numbers.add(Integer.parseInt(out.toString()));
                i--;
            }
        }
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
