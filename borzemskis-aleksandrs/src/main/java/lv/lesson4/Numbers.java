package lv.lesson4;

public class Numbers {

    public int getMaxNumber() {
        return maxNumber;
    }
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }
    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getFirstInputNumber() {
        return firstInputNumber;
    }
    public void setFirstInputNumber(int firstInputNumber) {
        this.firstInputNumber = firstInputNumber;
    }

    public int getSecondInputNumber() {
        return secondInputNumber;
    }
    public void setSecondInputNumber(int secondInputNumber) {
        this.secondInputNumber = secondInputNumber;
    }

    public int getThirdInputNumber() {return thirdInputNumber;}
    public void setThirdInputNumber(int thirdInputNumber) {
        this.thirdInputNumber = thirdInputNumber;
    }

    private int maxNumber;
    private int minNumber;
    private int firstInputNumber;
    private int secondInputNumber;
    private int thirdInputNumber;

    public Numbers(int maxNumber, int minNumber){
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }
    public Numbers(int firstInputNumber, int secondInputNumber, int thirdInputNumber){
        this.firstInputNumber = firstInputNumber;
        this.secondInputNumber = secondInputNumber;
        this.thirdInputNumber = thirdInputNumber;
    }
    public String getFullNumbers(){
        return "First input number is: " + firstInputNumber
                + "\nSecond input number is: " + secondInputNumber
                + "\nThird input number is: " + thirdInputNumber;
    }
}
