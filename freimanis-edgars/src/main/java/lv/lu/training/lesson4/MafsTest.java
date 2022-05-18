package lv.lu.training.lesson4;

public class MafsTest {
    public void test1(){
        QuickMafs victim = new QuickMafs();
    int a = 3;
    int b =5;

    int expectedResult = 5;
    int actualResult =victim.max(3,5);
    check(actualResult, expectedResult, "test1");
    }
    public void check(int actualResult, int expectedResult, String testName){
        if(actualResult == expectedResult) {
            System.out.println(testName + "has passed!");
        }else{
            System.out.println(testName + "has failed!");
            System.out.println("Expected " + expectedResult + "but was " + actualResult);
        }
    }
}
