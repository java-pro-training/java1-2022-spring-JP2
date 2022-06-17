package lv.lu.training.lesson11;

class NumberContainer {

    private int a;
    private int b;
    private int expectedResult;

    public NumberContainer(int a, int b, int expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getExpectedResult() {
        return expectedResult;
    }
}
