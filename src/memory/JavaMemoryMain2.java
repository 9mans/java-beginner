package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {

        System.out.println("메인 시작");
        method1();
        System.out.println("메인 종료");

    }

    static void method1() {

        System.out.println("메소드1 시작");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("메소드1 종료");
    }

    static void method2(Data data2) {
        System.out.println("메소드2 시작");
        System.out.println("데이터 값: " + data2.getValue());
        System.out.println("메소드2 종료");
    }
}
