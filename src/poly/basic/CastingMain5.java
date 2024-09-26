package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {

        Parent parent = new Parent();
        call(parent);
        Parent parent1 = new Child();
        call(parent1);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("child 인스턴스임");
            Child child = (Child) parent;
            child.childMethod();

        }
    }
}
