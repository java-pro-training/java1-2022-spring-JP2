package lv.lu.training.darupati;

public class TabulasAiles {
    private  String vards;
    private int atzime;

    public TabulasAiles(String vards, int atzime){
        this.vards = vards;
        this.atzime = atzime;
    }

    public TabulasAiles() {

    }


    public void setVards (String vards) {
        this.vards=vards;
    }
    public String getVards() {return vards;}


    public void setAtzime (int atzime){
        this.atzime=atzime;
    }
    public int getAtzime() {return atzime;}

}



