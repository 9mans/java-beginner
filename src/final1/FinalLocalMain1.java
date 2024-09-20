package final1;

public class FinalLocalMain1 {

    public static void main(String[] args) {

        final int data1 = 20;
        // 최초 한번만 할당 가능

    }

    static void method(final int parameter) {
//        parameter = 20;
        // 매개변수로 전달된 값이 변경되지 않는다.
    }
}
