package final1;

public class FinalRefMain {

    public static void main(String[] args) {

        final Data data = new Data();
        System.out.println(data);
//        data = new Data(); 새로운 인스턴스가 생성되지 않음
        System.out.println(data);

        data.value = 10;
        data.value = 20;
        data.value = 30;
        

    }
}
