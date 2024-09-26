package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        Child child = new Child();
        child.method();

        Parent parent = new Parent();
        parent.method();

        // 부모 변수가 자식 인스턴스를 참조하면 오버라이딩된 메서드가 우선순위를 가진다.)
        Parent poly = new Child();
        poly.method();
    }
}
