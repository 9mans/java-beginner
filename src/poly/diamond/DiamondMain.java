package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {

        Child child = new Child();

        child.methodA();
        child.methodB();
        child.common();

        InterfaceA child1 = new Child();
        child1.common();
        child1.methodA();

        InterfaceB child2 = new Child();
        child2.common();
        child2.methodB();
    }
}
