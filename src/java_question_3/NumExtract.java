package java_question_3;

import java.util.ArrayList;

/**
 * Extract numbers and find the smallest
 * number from the below string
 * “asdsdgbdfgjdfgn6sbdfh3hhj5j1jh5j66asryuop8ng2nb7mbb8k;0++)O)”
 */
public class NumExtract {

    public static void main(String[] args) {
        String input = "asdsdgbdfgjdfgn6sbdfh3hhj5j1jh5j66asryuop8ng2nb7mbb8k;0++)O)";
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                while (i != input.length() && Character.isDigit(input.charAt(i))) {
                    numbers.add(Integer.parseInt(String.valueOf(input.charAt(i))));
                    i++;
                }
                i--;
            }
        }
        numbers.sort(Integer::compareTo);
        StringBuilder outputUpdated = new StringBuilder();
        int countNumberOfZeros = 0;
        for (int number : numbers) {
            if (number != 0) {
                outputUpdated.append(number);
            } else {
                countNumberOfZeros++;
            }
        }
        while (countNumberOfZeros-- > 0) {
            outputUpdated.append("0");
        }
        System.out.println(outputUpdated);
    }
}
