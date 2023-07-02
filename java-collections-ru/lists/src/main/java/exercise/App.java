package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String chars, String word) {
        List<String> charList = new ArrayList<String>(Arrays.asList(chars.toLowerCase().split("")));
        List<String> wordChars = new ArrayList<String>(Arrays.asList(word.toLowerCase().split("")));
        StringBuilder newWordBuilder = new StringBuilder();

        for (String ch : wordChars) {
            if (charList.contains(ch)) {
                newWordBuilder.append(ch);
                charList.remove(ch);
            }
        }
        String newWord = newWordBuilder.toString();
        return newWord.equalsIgnoreCase(word);
    }
}
//END
