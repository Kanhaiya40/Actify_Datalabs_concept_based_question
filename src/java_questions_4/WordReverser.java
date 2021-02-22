package java_questions_4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse words in a sentence without using for loop and string and stringbuilder functions
 */
public class WordReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<String> words = new Stack<>();
        String[] splitWord = input.split("\\s+");
        for (String wor : splitWord) {
            words.push(wor);
        }
        StringBuilder output = new StringBuilder();
        while (!words.isEmpty()) {
            output.append(words.pop());
            output.append(" ");
        }
        System.out.println(output);
    }
}
