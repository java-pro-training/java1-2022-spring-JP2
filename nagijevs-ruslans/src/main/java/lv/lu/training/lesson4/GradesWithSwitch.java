package lv.lu.training.lesson4;

public class GradesWithSwitch {
    public static void main(String[] args) {
        int grade = 5;
        switch (grade) {
            case 10: {
                System.out.println("Izcili");
                break;
            }
            case 9: {
                System.out.println("Teicami");
                break;
            }
            case 8: {
                System.out.println("Ļoti labi");
                break;
            }
            case 7: {
                System.out.println("Labi");
                break;
            }
            case 6: {
                System.out.println("Gandrīz labi");
                break;
            }
            case 5: {
                System.out.println("Viduvēji");
                break;
            }
            case 4: {
                System.out.println("Gandrīz viduvēji");
                break;
            }
            case 3: {
                System.out.println("Vāji");
                break;
            }
            case 2: {
                System.out.println("Ļoti vāji");
                break;
            }
            case 1: {
                System.out.println("Ļoti, ļoti vāji");
                break;
            }
            case 0: {
                System.out.println("Nav vērtējuma");
            }
            default: {
                System.out.println("Vērtējumam ir jābūt no 0 līdz 10");
            }
        }

    }
}
