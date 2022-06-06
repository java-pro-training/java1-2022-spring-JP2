package lv.lu.training.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter implements Runnable {

    @Override

    public void run() {

        Map<String, Integer> wordCounts = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit: ");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }
            System.out.println(wordCounts);
        }

        for (String word : wordCounts.keySet()) {
            System.out.println(word + " = " + wordCounts.get(word));
        }

        input.close();
    }

    public static void addWord(String word, Map<String, Integer> wordMap) {
        Integer value = wordMap.get(word);
        if (value == null) {
            wordMap.put(word, 1);
        } else {
            value++;
            wordMap.put(word, value);
        }
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.run();
    }

}

