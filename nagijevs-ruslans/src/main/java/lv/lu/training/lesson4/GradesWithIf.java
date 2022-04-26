package lv.lu.training.lesson4;

public class GradesWithIf {
    public static void main(String[] args){
        int grade = 8;
        if (grade == 10) {
            System.out.println("Izcili");
        } else if (grade == 9) {
            System.out.println("Teicami");
        } else if (grade == 8) {
            System.out.println("Ļoti labi");
        } else if (grade == 7) {
            System.out.println("Labi");
        } else if (grade == 6) {
            System.out.println("Gandrīz labi");
        } else if (grade == 5) {
            System.out.println("Viduvēji");
        } else if (grade == 4) {
            System.out.println("Gandrīz viduvēji");
        } else if (grade == 3) {
            System.out.println("Vāji");
        } else if (grade == 2) {
            System.out.println("Ļoti vāji");
        } else if (grade == 1) {
            System.out.println("Ļoti, ļoti vāji");
        } else if (grade == 0) {
            System.out.println("Nav vērtējuma");
        } else {
            System.out.println("Vērtējumam ir jābūt no 0 līdz 10");
        }

    }
}
