package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {

        Parent parent = new Child();
        Child child = (Child)parent;

        Parent parent2 = new Parent();
        Child child1 = (Child) parent2;
        child1.childMethod();




    }
}
