package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Birld birld = new Birld();
        Chicken chicken = new Chicken();

        dog.sound();
        dog.move();

        birld.fly();
        birld.sound();

        chicken.fly();
        chicken.sound();

        soundAnimal(dog);
        soundAnimal(birld);
        soundAnimal(chicken);

        fly(birld);
        fly(chicken);

        Fly fly1 = new Birld();
        fly1.fly();
    }

    // 추상클래스를 상속한 자식들만 사용가능
    private static void soundAnimal(Animal animal) {

        animal.sound();
    }

    // 인터페이스를 구현한 클래스만 사용가능
    private static void fly(Fly fly) {
        fly.fly();
    }
}
