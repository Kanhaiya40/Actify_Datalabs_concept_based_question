package java_questions_2;

import java.util.ArrayList;

public class SpecialCharacterFilter {

    public static void main(String[] args) {
        String input = "[{id : 1, name : “JAVA”},{id:2,name : ”C”,{id:5,name:”C++”},{id:3,name:”JS”},{id:4,name:”Angular”}]";
        String updatedInput = input.replace(" ", "");
        ArrayList<Character> listOfSpecialCharacter = new ArrayList<>();
        for (int i = 0; i < updatedInput.length(); i++) {
            if (Character.isDigit(updatedInput.charAt(i)) || Character.isLetter(updatedInput.charAt(i))) {

            } else {
                listOfSpecialCharacter.add(updatedInput.charAt(i));
            }
        }
        System.out.println(listOfSpecialCharacter);
    }
}
