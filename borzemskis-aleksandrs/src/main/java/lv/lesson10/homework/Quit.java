package lv.lesson10.homework;

public class Quit extends RuntimeException{
    Quit(String message){
        super(message);
    }
}
