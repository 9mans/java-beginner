package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // 타입이 다르기때문에 이런 방법은 할 수 없다 하지만 타입이 같아진다면?
//        Caw[] cawArr = {dog, cat, caw};

        System.out.println("동물 소리 테스트");
        dog.sound();
        cat.sound();
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }

//    private static void sound(Caw caw) {
//        System.out.println("소리 테스트");
//        caw.sound();
//        System.out.println("소리 종료");
//    }
}
