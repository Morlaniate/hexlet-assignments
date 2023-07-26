package exercise;

import java.util.*;

// BEGIN
class App {
//    String sentence = "java is the best programming language java";
//    Map wordsCount = App.getWordCount(sentence);
//    System.out.println(wordsCount); // => {the=1, java=2, is=1, best=1, language=1, programming=1}

    public static Map<String, Integer> getWordCount(String sentence) {

        if (sentence.equalsIgnoreCase("")) {
            Map<String, Integer> result = new HashMap<>();
            return result;
        }

        String[] sentenceToWords = sentence.split(" ");

        List<String> wordsList = Arrays.asList(sentenceToWords);
        ArrayList<String> wordsArrayList = new ArrayList<>(wordsList);

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArrayList) {
            Integer count = Collections.frequency(wordsArrayList, word);
            wordCount.put(word, count);
        }
        System.out.println(wordCount);
        return wordCount;
    }
    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }
        String result = "{\n";
        for (Map.Entry<String, Integer> each: dictionary.entrySet()) {
            result += "  " + each.getKey() + ": " + each.getValue() + "\n";
        }
        result += "}";
        return result;
    }
}
//END
