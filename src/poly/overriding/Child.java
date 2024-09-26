package poly.overriding;

public class Child extends Parent {

    private String value = "child";

    @Override
    public void method() {
        System.out.println("child method");
    }
}
