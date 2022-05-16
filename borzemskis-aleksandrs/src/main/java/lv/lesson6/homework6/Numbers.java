package lv.lesson6.homework6;

import lombok.Data;

@Data
public class Numbers {
    private int maxNumber;
    private int minNumber;
    private int firstInputNumber;
    private int secondInputNumber;
    private int thirdInputNumber;

    public Numbers(){}

    public Numbers(int maxNumber, int minNumber){
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

}
