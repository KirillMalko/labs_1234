//Напечатать без повторения слова текста, у которых первая и последняя буквы
//        совпадают.

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String text = "The quickq brown fof jumps over the lazy dog ana ana";
        HashSet<String> words = new HashSet<String>();
        String[] allWords = text.split("\\s+");

        for (String word : allWords) {
            if (word.length() > 1 && word.charAt(0) == word.charAt(word.length() - 1)) {
                words.add(word.toLowerCase());
            }
        }


        System.out.println("Слова с первой и последней буквой, которые совпадают:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}





