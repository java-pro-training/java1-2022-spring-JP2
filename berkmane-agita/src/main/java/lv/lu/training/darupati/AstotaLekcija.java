package lv.lu.training.darupati;

import java.util.*;

public class AstotaLekcija {
    public static void main(String[] args) {
        //izdrukā krāsas
        List<String> kraasas = new ArrayList<>();
        kraasas.add("sarkans");
        kraasas.add("zaļš");
        kraasas.add("zils");
        kraasas.add("balts");
        for (String kraasa : kraasas) {
            System.out.println(kraasa);
        }
        //*******************************
       /* String[] dayArray = new String[] { "Pirmd.", "otrd,"};
        List<String> daysList= List.of("Pirmd.", "Otrd.");
        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put*/
        //**************
        Map<String, Integer> dayNumber = new HashMap<>();
        dayNumber.put("Pirmdiena", 1);
        dayNumber.put("Otrdiena", 2);
        dayNumber.put("Tre", 3);
        dayNumber.put("Cet", 4);
        dayNumber.put("Piektd", 5);
        dayNumber.put("Sestd", 6);
        dayNumber.put("Svētd", 7);

        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
      Integer number = dayNumber.get(day);

        if (number != null) {
            System.out.println("Dienas" + day + "kārtas numurs nedēļā ir " + dayNumber.get(day));
        } else {
            System.out.println("kļūda");
        }
 scanner.close();
        //****************************



        Map<String, Integer> dienas = new HashMap<>();
        dayNumber.put("Pirmdiena", 11);
        dayNumber.put("Otrdiena", 21);
        dayNumber.put("Trešdiena", 31);
        dayNumber.put("Ceturtdiena", 41);
        dayNumber.put("Piektdiena", 51);
        dayNumber.put("Sestdiena", 61);
        dayNumber.put("Svētdiena", 71);
        System.out.println("izdrukā atslēgas");
for (String key : dienas.keySet()){
    System.out.println(key);
}
        System.out.println("izdrukā vērtības");
        for (Integer numbers : dienas.values()){
            System.out.println(numbers);
        }
    }

}