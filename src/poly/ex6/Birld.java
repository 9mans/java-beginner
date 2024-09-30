package poly.ex6;

public class Birld extends Animal implements Fly {
    @Override
    public void fly() {
        System.out.println("날기");
    }

    @Override
    public void sound() {
        System.out.println("짹쟥");
    }
}
