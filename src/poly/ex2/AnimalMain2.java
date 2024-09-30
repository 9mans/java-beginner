package poly.ex2;

public class AnimalMain2 {
    public static void main(String[] args) {

//        Dog dog = new Dog();
//        Caw caw = new Caw();
//        Cat cat = new Cat();
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
//            System.out.println("동물소리시작");
//            animal.sound();
//            System.out.println("동물소리종료");
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 시작");
        animal.sound();
        System.out.println("동물소리 종료");
    }
}
