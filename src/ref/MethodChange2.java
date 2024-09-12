package ref;

public class MethodChange2 {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.value = 10;
        System.out.println(data1.value);
        changeRef(data1);
        System.out.println(data1.value);

    }

    static void changeRef(Data data) {

        data.value = 20;
    }
}
