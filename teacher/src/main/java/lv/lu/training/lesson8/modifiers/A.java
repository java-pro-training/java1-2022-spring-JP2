package lv.lu.training.lesson8.modifiers;

public class A {

    public String doSomethingPublic() {
        return "Public method";
    }

    String doSomethingDefault() {
        return "Default method";
    }

    protected String doSomethingProtected() {
        return "Protected method";
    }

    private String doSomethingPrivate() {
        return "Private method";
    }

}
