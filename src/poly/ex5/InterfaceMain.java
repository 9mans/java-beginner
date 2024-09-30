package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.move();
        dog.sound();

        cat.move();
        cat.sound();
    }
}
