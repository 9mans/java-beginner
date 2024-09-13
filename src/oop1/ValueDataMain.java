package oop1;

public class ValueDataMain {

    public static void main(String[] args) {

        ValueData valueData = new ValueData();

        valueUp(valueData);
        valueUp(valueData);
        valueUp(valueData);
        valueUp(valueData);
        valueUp(valueData);

        valueData.add();
        valueData.add();
        valueData.add();
        valueData.add();
    }

    static void valueUp(ValueData valueData) {
        valueData.value++;
        System.out.println("증가: " + valueData.value);
    }
}
