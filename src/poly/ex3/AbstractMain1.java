package poly.ex3;

public class AbstractMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.move();
        dog.sound();

        cat.move();
        cat.sound();

        soundAnimal(cat);
        soundAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.move();
        animal.sound();
    }
}
