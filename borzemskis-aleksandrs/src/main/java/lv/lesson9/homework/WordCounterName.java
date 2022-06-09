package lv.lesson9.homework;

import java.util.*;

public class WordCounterName {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Map<String, Integer> wordCounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Please enter line of words or type quit:");
           String line = scanner.nextLine().toLowerCase();
            if (line.contains("quit")) break;
            for (String currentWord : line.split(" ")) {//if "" - split to string character, if " " - split to words
                addWord(currentWord, wordCounts);
            }
           sortTheArray(wordCounts);
           wordCounts.clear();//array has to clear, because second input contains old words
        }
        scanner.close();
    }

    static void addWord(String word, Map<String, Integer> wordMap) {
        Integer numberOfTheSameWords = wordMap.get(word);
        if (numberOfTheSameWords == null) {
            wordMap.put(word, 1);
        } else {
            numberOfTheSameWords++;
            wordMap.put(word, numberOfTheSameWords);
        }
    }

    private static void sortTheArray(Map<String, Integer> arrayToSort) {
        List<Map.Entry<String, Integer>> sortedArray = new ArrayList<>(arrayToSort.entrySet());
        sortedArray.sort(Map.Entry.comparingByValue());
        Collections.reverse(sortedArray);
        printResult(sortedArray);
    }

    private static void printResult(List<Map.Entry<String, Integer>> sortedArray) {
        int i = 1;
        for (Map.Entry<String, Integer> entry : sortedArray) {
            System.out.println(i + " word '" + entry.getKey() + "' was " + entry.getValue() + " times");
            i++;
        }
    }
}
