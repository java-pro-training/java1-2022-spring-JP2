package lv.lu.training.lesson9.homework.lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    private Map<String, Integer> wordCounts = new HashMap<>();

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.run();
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit:");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split("")) {
                addWord(word, wordCounts);
            }

            for (String word : wordCounts.keySet()) {
                System.out.println(word + " = " + wordCounts.get(word));
            }
            wordCounts.clear();
        }
        input.close();
    }

    public void addWord(String word, Map<String, Integer> wordCounts) {
        Integer wordCount = wordCounts.get(word);
        if (wordCount == null) {
            wordCount = 1;
        } else {
            wordCount++; //wordCount = wordCount + 1; wordCount +=1;
        }
        wordCounts.put(word, wordCount);
    }


}
