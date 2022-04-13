package lv.lu.training.lesson3;

public class Math {

    private int result;

    public void sum(int a, int b) {
        result = a + b;
    }

    public void addToResult(int a) {
        //result = result + a;
        result += a;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.sum(1, 3);
        math.addToResult(10);

        System.out.println(math.getResult());
    }

}
