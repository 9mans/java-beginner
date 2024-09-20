package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자로 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit1 = new ConstructInit(20);
        System.out.println(constructInit.value);
//        constructInit1.value = 20;
        System.out.println(constructInit1.value);

        FiledInit filedInit = new FiledInit();
        int number = filedInit.value;

        System.out.println(FiledInit.CONST_VALUE);
    }
}
