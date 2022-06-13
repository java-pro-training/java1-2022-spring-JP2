package lv.lu.training.lesson9.homework.lesson;

import java.util.*;

public class WordCounter2 {

    private Map<String, Integer> wordCounts = new HashMap<>();

    public static void main(String[] args) {
        WordCounter2 wordCounter = new WordCounter2();
        wordCounter.run();
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit:");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());

            entries.sort(new EntryComparator());

            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
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
