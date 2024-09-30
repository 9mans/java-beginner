package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("a 인터페이스의 메서드");
    }

    @Override
    public void common() {
        System.out.println("a,b 둘 다 포함된 메서드 오버라이딩을 했기때문에 child의 메서드가 실행된다.");
    }

    @Override
    public void methodB() {
        System.out.println("B 인터페이스의 메서드");
    }
}
