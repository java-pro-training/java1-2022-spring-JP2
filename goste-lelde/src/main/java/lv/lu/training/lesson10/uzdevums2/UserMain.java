package lv.lu.training.lesson10.uzdevums2;


import lv.lu.training.lesson10.uzdevums1.ValidationException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMain {

    public static void main(String [] args){

        while(true){
            try{

                UserValidator validator = new UserValidator();
                Scanner console = new Scanner(System.in);
                System.out.println("Please enter name for new user:");
                String name = console.nextLine();
                validator.validateName(name);

                System.out.println("Please enter last name for new user:");
                String lastName = console.nextLine();
                validator.validateName(lastName);


                System.out.println("Please enter age for new user:");
                int age = console.nextInt();


                User newUser = new User(name,lastName,age);
                System.out.println("New user created!");
                System.out.println(newUser.getUser());


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


    }


}
