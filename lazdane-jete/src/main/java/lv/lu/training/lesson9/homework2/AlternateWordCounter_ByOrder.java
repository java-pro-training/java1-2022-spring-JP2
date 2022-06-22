package lv.lu.training.lesson9.homework2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlternateWordCounter_ByOrder {

        public static void main(String[] args) {

            Map<String, Integer> wordMap = new HashMap<>();

            String[] wordArray = new String[]
                    {"Vacu valoda", "Kulturologija", "Zoologija", "Literatura", "Kulturologija", "Sports"};

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
