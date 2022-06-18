package lv.lu.training.lesson10.uzdevums2;

import lv.lu.training.lesson10.uzdevums1.ValidationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMainCyclic {

    public static void main(String [] args){

        User newUser = new User();
        UserValidator validator = new UserValidator();


        while(true){
            try{
                System.out.println("Please enter name for new user:");
                Scanner console = new Scanner(System.in);
                String name = console.nextLine();
                validator.validateName(name);

                newUser.setName(name);
                break;

            }catch (ValidationException e){
                System.out.println("Error in entering New User");
                System.out.println(e.getMessage());
                System.out.println("Please try again..");
            }
        }

        while (true){
            try{
                System.out.println("Please enter last name for new user:");
                Scanner console = new Scanner(System.in);
                String lastName = console.nextLine();
                validator.validateName(lastName);

                newUser.setSurname(lastName);
                break;

            }
            catch (ValidationException e){
                System.out.println("Error in entering New User");
                System.out.println(e.getMessage());
                System.out.println("Please try again..");
            }
        }

        while (true){

            try{
                System.out.println("Please enter age for new user:");
                Scanner console = new Scanner(System.in);
                int age = console.nextInt();
                validator.validateAge(age);

                newUser.setAge(age);
                break;

            }catch (ValidationException e){
                System.out.println("Error in entering New User");
                System.out.println(e.getMessage());
                System.out.println("Please try again..");
            }
            catch (InputMismatchException e){
                System.out.println("Error in entering New User");
                System.out.println("Age needs to be a number.");
                System.out.println("Please try again..");
            }
        }
        System.out.println("New user created!");
        System.out.println(newUser.getUser());

    }

}
