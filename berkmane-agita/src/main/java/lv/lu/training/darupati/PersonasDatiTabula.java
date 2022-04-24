package lv.lu.training.darupati;

public class PersonasDatiTabula {

    public static void main(String[] args) {
        TabulasAiles persona1 = new TabulasAiles("Agita", 2);


        TabulasAiles persona2 = new TabulasAiles();
        persona2.setVards("Ojārs ");
        persona2.setAtzime(5);


        System.out.println(persona1.getVards() + persona1.getAtzime());
        System.out.println(persona2.getVards() + persona2.getAtzime());
    }

}
