package lv.lu.training.lesson9;
import org.w3c.dom.Text;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordCounter {

    public static void main (String [] args) {
            String input= inputText.Text ;
        List <String> inputList=new ArrayList<String>();
        inputList=Arrays.asList(input.split(" "));
        int size = inputList.size();

        int i =0;
        Map <String, Integer> duplicateCount = new HashMap<String, Integer>();
        for (int j=0; size>j; j++){
            int count = 0;
            for (i=0; size >i;i++){
                if (inputList.get(j).equals(inputList.get(i))){
                    count++;
                    duplicateCount.put(inputList.get(j), count);
                }
            }
        }
        System.out.println(duplicateCount);
        List <Integer> myCountList = new ArrayList<>();
        Set <String> myValueSet = new HashSet<>();
        for (Map.Entry<String , Integer> entry: duplicateCount.entrySet()){
            myCountList.add(entry.getValue());
            myValueSet.add(entry.getKey());
        }


        }
    }
    