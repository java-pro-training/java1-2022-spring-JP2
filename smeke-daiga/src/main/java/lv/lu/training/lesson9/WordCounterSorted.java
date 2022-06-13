package lv.lu.training.lesson9;

import java.util.*;

//Lietotājs standarta ievadā ievada rindas ar vārdiem
//Programmai ir jānolasa vārdi un ir jāizdrukā ievadīto vārdu biežumus augošā secībā
//Par pamatu izmanotjiet kodu no ierpiekšējā uzdevuma
public class WordCounterSorted {
    public static void main(String[] args) {
        run2();
    }

    public static void run2() {
        Map<String,Integer> wordCounts = new HashMap<>();

        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Please enter line of words or type quit:");
            String line=input.nextLine();
            if(line.contains("quit"))break;
            String cleanLine = line.replaceAll("\\p{Punct}", "").toLowerCase();
            for(String word:cleanLine.split(" ")){
                addWord2(word,wordCounts);
            }
        }

        for(Map.Entry<String, Integer> entry : sortByValue(wordCounts)) {
            System.out.println("Vārds " + entry.getKey() + " tekstā ir izmantots " + entry.getValue() + " reizi/es.");
        }


        input.close();
    }
    //Metode saņem vārdu un Map kolekciju.
    //Ja vārds jau atrodas kolekcijā, vērtību palielinām par 1,
    //Pretējā gadījumā pievienojam jaunu elementu. Atslēga = vārds, vērtība = 1

    //Map<String,Integer> wordCounts = new HashMap<>();

    public static void addWord2(String word, Map<String, Integer> wordCounts) {


        if (wordCounts.containsKey(word)) {
            wordCounts.put(word, wordCounts.get(word) + 1);
        } else {
            wordCounts.put(word, 1);
        }
    }


    // function to sort hashmap by values
    private static List <Map.Entry<String, Integer>> sortByValue(Map<String, Integer> unsortedMap) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(unsortedMap.entrySet());
        //Sort the list
        sortedList.sort(Map.Entry.comparingByValue());

        return sortedList;
    }

}
