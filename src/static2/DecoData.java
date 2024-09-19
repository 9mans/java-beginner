package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
        staticMethod();
        //instanceValue;
        //instanceMethod();
    }

    public void instanceCall() {
        staticMethod();
        staticValue++;
        instanceValue++;
        instanceMethod();
    }
    private void instanceMethod() {

    }
    private static void staticMethod() {

    }
}
