package lv.lu.training.lesson9.uzdevums1;

import java.util.HashMap;
import java.util.Map;

public class AlternativeWordCounter {

    Map<String,Integer> wordMap = new HashMap<>();

    public static void main (String[] args){
        AlternativeWordCounter wordCount = new AlternativeWordCounter();
        wordCount.run();

    }

    void run(){
        String[] wordArray = new String[] {"Zoologija", "Matematika","Matematika", "Zoologija", "Literatura", "Matematika","Geografija"};
        String[] wordList= wordArray;
        for(String word:wordList){ addWord(word,wordMap);
        } System.out.println(wordMap); }


    private  void addWord(String word, Map<String,Integer> wordCounts){
        Integer wordCount = wordCounts.get(word);
        if (wordCount==null){
            wordCount=1;
        }else {
            wordCount++;
        }
        wordCounts.put(word,wordCount);
    }

}
