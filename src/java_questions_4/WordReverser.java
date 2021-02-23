package java_questions_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Reverse words in a sentence without using
 * for loop and string and StringBuilder functions
 */
public class WordReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] toChar = input.toCharArray();
        char[] output = reverseString(toChar);
        String out = Arrays.toString(output).replace(", ", "")
                .replace("[", "")
                .replace("]", "");
        System.out.println(out);
    }

    private static char[] reverseString(char[] toChar) {
        char[] output = new char[toChar.length];
        int startIndex = 0;
        int lastIndex = startIndex;
        while (true) {
            if (lastIndex == toChar.length) {
                int k = lastIndex;
                while (startIndex != lastIndex) {
                    output[startIndex++] = toChar[--k];
                }
                break;
            } else if (toChar[lastIndex] == ' ') {
                int k = lastIndex;
                while (startIndex != lastIndex) {
                    output[startIndex++] = toChar[--k];
                }
                output[startIndex] = toChar[lastIndex];
                lastIndex++;
                startIndex = lastIndex;
            } else
                lastIndex++;
        }
        return output;
    }
}
