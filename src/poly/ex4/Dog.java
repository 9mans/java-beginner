package poly.ex4;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("동물소리시작");
        System.out.println("멍멍");
        System.out.println("동물소리종료");
    }

    @Override
    public void move() {
        System.out.println("강아지가 이동한다");
    }
}
