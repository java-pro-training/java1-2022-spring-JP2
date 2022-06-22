package lv.lu.training.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    private static Map<String,Integer> wordCounts = new HashMap<>();

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        WordCounter.run();
    }
    public static void run() {
            Scanner input=new Scanner(System.in);
            while(true){
                System.out.println("Please enter line of words or type quit:");
                String line=input.nextLine();
                if(line.contains("quit"))break;
                for(String word:line.split(" ")){
                    addWord(word,wordCounts);
                }
            }

            for(String word:wordCounts.keySet()){
                System.out.println(word+" = "+wordCounts.get(word));
            }

            input.close();
        }

        public static void addWord (String word, Map < String, Integer > wordMap){
            Integer wordCounts = wordMap.get(word);
            if (wordCounts == null) {
                wordMap.put(word, 1);
            } else {
                wordCounts++;
                wordMap.put(word, wordCounts);
            }
        }
}