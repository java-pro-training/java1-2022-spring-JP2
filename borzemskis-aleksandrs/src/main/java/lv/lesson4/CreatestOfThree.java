package lv.lesson4;

import java.util.Scanner;

public class CreatestOfThree {
    public static void main(String[] args) {
        int biggerNumber;

        System.out.println("\nThis is program how to find max number from three digits\n");
        Numbers userAnswers = new Numbers(0, 0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first digit");
//------------We can use method isInputNumberIsInteger() to check input
//        userAnswers.setFirstInputNumber(userAnswers.isInputNumberIsInteger());
//------------
        userAnswers.setFirstInputNumber(scanner.nextInt());
        System.out.println("Please input second digit");
        userAnswers.setSecondInputNumber(scanner.nextInt());
        System.out.println("Please input third digit");
        userAnswers.setThirdInputNumber(scanner.nextInt());

        System.out.println("test\n" + userAnswers.getFullNumbers());

        CreatestOfThree maxNumber = new CreatestOfThree();
        biggerNumber = maxNumber.max(
                userAnswers.getFirstInputNumber(),
                userAnswers.getSecondInputNumber(),
                userAnswers.getThirdInputNumber());
        System.out.println("\nThe bigger number is: " + biggerNumber);
    }
    int max(int a1,int a2, int a3){
        if (a1>a2 && a1>a3){
            return a1;
        }else if (a2>a1 && a2>a3){
            return a2;
        }else {return a3;}
    }


}
