package lv.lu.training.lesson9.homework.lesson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlternateWordCount {

    private Map<String, Integer> wordCounts = new HashMap<>();

    public static void main(String[] args) {
        AlternateWordCount wordCount = new AlternateWordCount();
        wordCount.run();
    }

    void run() {
        String[] wordArray = new String[]
                {"Zoologija",
                        "Matematika",
                        "Zoologija",
                        "Literatura",
                        "Matematika"};

        List<String> wordList = Arrays.asList(wordArray);

        for (String word : wordList) {
            addWord(word, wordCounts);
        }
        System.out.println(wordCounts);
    }

    public void addWord(String word, Map<String, Integer> wordMap) {
        Integer wordCount = wordCounts.get(word);
        if (wordCount == null) {
            wordCount = 1;
        } else {
            wordCount++; //wordCount = wordCount + 1; wordCount +=1;
        }
        wordCounts.put(word, wordCount);
    }

}
