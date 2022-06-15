package lv.lu.training.lesson9.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlternateWordCounter {

    public static void main(String[] args) {

        Map<String, Integer> wordMap = new HashMap<>();

        String[] wordArray = new String[]
                {"Zoologija",
                        "Matematika",
                        "Zoologija",
                        "Literatura",
                        "Matematika"};

        List<String> wordList = Arrays.asList(wordArray);

        for (String word : wordList) {
            addWord(word, wordMap);
        }
        System.out.println(wordMap);

    }

    private static void addWord(String word, Map<String, Integer> wordCounts) {
        wordCounts.put(word, incrementCounter(word, wordCounts));
    }

    private static Integer incrementCounter(String word, Map<String, Integer> wordCounts) {
        Integer wordCount = wordCounts.get(word);
        if (wordCount == null) {
            return 1;
        }
        return ++wordCount;
    }

}
