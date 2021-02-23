package java_questions_4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse words in a sentence without using
 * for loop and string and StringBuilder functions
 */
public class WordReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] toChar = input.toCharArray();
        Stack<String> words = new Stack<>();
        Stack<String> output = reverseString(toChar, words, 0);
        StringBuilder originalOutput = new StringBuilder();
        while (!output.isEmpty()) {
            originalOutput.append(output.pop()).append(" ");
        }
        System.out.println(originalOutput.toString());
    }

    private static Stack<String> reverseString(char[] toChar, Stack<String> words, int index) {
        StringBuilder word = new StringBuilder();
        int startIndex = index;
        int lastIndex = startIndex;
        while (true) {
            if (lastIndex == toChar.length) {
                while (startIndex != lastIndex) {
                    word.append(toChar[startIndex++]);
                }
                words.push(word.toString());
                break;
            } else if (toChar[lastIndex] == ' ') {
                while (startIndex != lastIndex) {
                    word.append(toChar[startIndex++]);
                }
                words.push(word.toString());
                reverseString(toChar, words, startIndex + 1);
                break;
            } else
                lastIndex++;
        }
        return words;
    }
}
