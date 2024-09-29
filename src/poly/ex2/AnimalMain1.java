package poly.ex2;

public class AnimalMain1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        Animal[] animals = new Animal[3];

        animals[0] = new Cat();
        animals[1] = new Caw();
        animals[2] = new Dog();

        animals[0].sound();
        animals[1].sound();
        animals[2].sound();
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리시작");
        animal.sound();
        System.out.println("동물소리종료");
    }
}
