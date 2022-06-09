package lv.lu.training.lesson8;

public class SingingSingers {
    public static void main(String[] args) {
        Singer elvis = new ElvisPresley();
        Singer jackson = new MichaelJackson();
        Singer spears = new BritneySpears();
        elvis.sing();
        jackson.sing();
        spears.sing();

        Singer[] singers = new Singer[2];
        singers[0] = new ElvisPresley();
        singers[1] = new BritneySpears();
        for (Singer singer : singers) {
            singer.sing();
        }
    }


}
