package lv.lu.training.lesson10;

//Izveidojam jaunu kļūdas tipu
public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }

}
