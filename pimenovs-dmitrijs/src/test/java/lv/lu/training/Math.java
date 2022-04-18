package lv.lu.training;

public class Math {

    private int result;
    private int result2;
    private int result3;
    private int result4;

    public void reizinasana(int a, int b) {
        result = a * b;
    }

    public void saskaitisana(int a) {
        result2 = a + result;
    }

    public void dalisana(int a) {
        result3 = result2 / a;
    }
    public void reizinasana2(int a,int b){
        result4 = result3*a*b;
    }

    public int getResult() {
        return result;
    }

    public int getResult2() {
        return result2;
    }

    public int getResult3() {
        return result3;
    }

    public int getResult4() {
        return result4;
    }

    public static void main(String[] args) {
        Math difficult = new Math();
        difficult.reizinasana(11, 3);
        difficult.saskaitisana(33);
        difficult.dalisana(3);
        difficult.reizinasana2(2,5);

        System.out.println(difficult.getResult());
        System.out.println(difficult.getResult2());
        System.out.println(difficult.getResult3());
System.out.println(difficult.getResult4());

    }


}