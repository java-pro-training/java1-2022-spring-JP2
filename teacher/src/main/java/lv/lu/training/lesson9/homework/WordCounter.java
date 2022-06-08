package lv.lu.training.lesson9.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit:");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }

            for (String word : wordCounts.keySet()) {
                System.out.println(word + " = " + wordCounts.get(word));
            }

            input.close();
        }

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
