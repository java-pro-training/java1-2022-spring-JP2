package lv.lu.training.lesson7;

public class Participants {

    public static void main(String[] args) {
        String[] firstGroup = new String[10];
        firstGroup[1] = "Jānis Bērziņš";
        firstGroup[2] = "Līga Kalniņa";
        firstGroup[3] = "Dace Ozoliņa";
        firstGroup[5] = "Ernests Briedis";
        firstGroup[9] = "Laila Ozola";

        String[] secondGroup = {"Andris Vitols", "Zane Lakstīgala", "Roberts Pakalns"};

        printParticipants(firstGroup);
        System.out.println("==============================");
        printParticipants(secondGroup);
    }

    private static void printParticipants(String[] participants) {
        for (int i = 0; i < participants.length; i++) {
            if (participants[i] != null) {
                System.out.println(participants[i]);
            }
        }
    }

}
