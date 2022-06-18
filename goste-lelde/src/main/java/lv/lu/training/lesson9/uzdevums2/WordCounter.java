package lv.lu.training.lesson9.uzdevums2;


import java.util.*;

public class WordCounter {

    Map<String,Integer> wordCounts = new HashMap<>();

    public static void main (String[] args){
        WordCounter wordCounter = new WordCounter();
        wordCounter.run();

    }

    public void run(){
        Scanner input=new Scanner(System.in);
        while(true){

            System.out.println("Please enter line of words or type quit:");
            String line=input.nextLine();
            if(line.contains("quit"))break;
            for(String word:line.split(" ")){
                addWord(word,wordCounts);
            }

            List<Map.Entry<String,Integer>> entries = new ArrayList(wordCounts.entrySet());

            Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            for(Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " +entry.getValue());
            }
            wordCounts.clear();
        }

        input.close();
    }

    public  void addWord(String word, Map<String,Integer> wordCounts){
        Integer wordCount = wordCounts.get(word);
        if (wordCount==null){
            wordCount=1;
        }else {
            wordCount++;
        }
        wordCounts.put(word,wordCount);
    }


}
