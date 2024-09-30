package poly.ex4;

import poly.ex3.AbstractAnimal;
import poly.ex3.Cat;
import poly.ex3.Dog;

public class AbstractMain1 {
    public static void main(String[] args) {

        poly.ex3.Dog dog = new Dog();
        poly.ex3.Cat cat = new Cat();

        dog.move();
        dog.sound();

        cat.move();
        cat.sound();

        soundAnimal(cat);
        soundAnimal(dog);

        moveAnimal(cat);
        moveAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.move();
        animal.sound();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
