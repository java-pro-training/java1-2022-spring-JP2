package lv.lu.training.darupati.DeviitaaLekcija;

import java.util.*;

public class SimpleMapExample {
    public static void main (String [] args){
        String[] daysArray = new String[]{"Pirmdiena", "Otrdiena", "Trešdiena"};

        List<String> daysString = List.of("Pirmdiena", "Otrdiena", "Trešdiena");

        Map<Integer, String> daysMap = new HashMap<>();     //šeit Map ir interfeiss un tam nāk klāt gan objekts, gan indekss(kas var vūt ne tikai integer)
        daysMap.put(0, "Pirmdiena");
        daysMap.put(1, "Otrdiena");
        daysMap.put(2, "Trešdiena");

        for (int i = 0; i<daysMap.size(); i++){
            System.out.println(daysMap.get(i));
        }
        //Vēl ir Set un Hashset, kas ir kopas - katrs elements var būt minēts 1 reizi un izdrukaāsies jauktā secībā.
        Set<String> colors = new HashSet<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Purple");

        for (String color : colors){
            System.out.println(color);
        }
    }



}
