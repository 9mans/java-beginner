package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
    Child child = new Child();

    Parent parent1 = child;
    Parent parent2 = (Child)child;

    parent2.parentMethod();
    parent1.parentMethod();

    }


}
