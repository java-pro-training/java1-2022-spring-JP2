package lv.lu.training.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Programmai ir jānolasa vārdi un ir jāizdrukā ievadīto vārdu biežumus

//Izveidojam jaunu klasi WordCounter ar metodi “main”
public class WordCounter {
    public static void main(String[] args) {

        //No “main” metodes izsaucam run metodi. Run metode lasa no termināļa ievadītos vārdus

        run();

}

    public static void run() {
        Map<String,Integer> wordCounts = new HashMap<>();

        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Please enter line of words or type quit:");
            String line=input.nextLine();
            if(line.contains("quit"))break;
            for(String word:line.split(" ")){
                addWord(word,wordCounts);
            }
        }

        for(String word : wordCounts.keySet()){
            System.out.println(word+" = " + wordCounts.get(word));
        }

        input.close();
    }

    //Metode saņem vārdu un Map kolekciju.
    //Ja vārds jau atrodas kolekcijā, vērtību palielinām par 1,
    //Pretējā gadījumā pievienojam jaunu elementu. Atslēga = vārds, vērtība = 1

    //Map<String,Integer> wordCounts = new HashMap<>();

    public static void addWord(String word, Map<String, Integer> wordCounts) {


            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }


    }

}

