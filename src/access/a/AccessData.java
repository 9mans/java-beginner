package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println(publicField + "퍼블릭");
    }

    void defaultMethod() {
        System.out.println("디폴트" + defaultField);
    }

    private void privateMethod() {
        System.out.println(privateField + "프라이빗");
    }

    public void innerAccess() {
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}

class dClass {

}
