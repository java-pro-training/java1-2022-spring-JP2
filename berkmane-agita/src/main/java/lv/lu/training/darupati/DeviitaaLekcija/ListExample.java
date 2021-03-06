package lv.lu.training.darupati.DeviitaaLekcija;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {
    public static void main (String[] args) {
        //kolekcija <Datu tips> nosaukums = jauns objekts
        ArrayList<String> colors = new ArrayList();
        colors.add("Zils");
        colors.add("Zaļš");
        colors.add("Brūns");
        colors.add("Rozā");

        //lai pievienotu, raksta
        colors.add("Sarkans");

        //lai nodzēstu, traksta remove un var izvēlēties dzēst pēc indeksa vai pēc objekta (nosaukuma)
        colors.remove(2);


        //drukāšana

        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("********************");


        //sarakstu jeb kolekciju var defināt arī šādi, Tā sanāk īsāk.

        //List<String> kraasas = List.of();
        List<String > kraasas = new ArrayList<>(List.of("Zaļš", "Zils", "Rozā"));

        for (String konkretaKraasa : kraasas){
            System.out.println(konkretaKraasa);
        }



    }
}
