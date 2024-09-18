package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {

        AccessData accessData = new AccessData();

        // 퍼블릭
        accessData.publicField = 10;
        accessData.publicMethod();

        // 디폴트
        accessData.defaultField = 2;
        accessData.defaultMethod();

        accessData.innerAccess();

        dClass dClass = new dClass();

    }
}

