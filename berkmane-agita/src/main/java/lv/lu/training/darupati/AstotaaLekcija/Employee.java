package lv.lu.training.darupati.AstotaaLekcija;

public class Employee extends Person{  //Klase employee manto klases Person laukus

    private String jobTitle;

    public Employee (String firstName, String lastName, String jobTitle){
        super(firstName, lastName);     //visu kodu sāk, izsaucot Person konstruktoru

        this.jobTitle=jobTitle;

        }
        public String getJobTitle (){
            return jobTitle;
    }
}
