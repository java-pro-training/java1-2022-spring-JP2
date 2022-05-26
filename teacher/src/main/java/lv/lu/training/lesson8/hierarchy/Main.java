package lv.lu.training.lesson8.hierarchy;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.method1();

        B b = new B();
        b.method2();

        C c = new C();
        c.method1();
        c.method2();

        D d = new D();
        d.method1();
        d.method2();

    }

}
