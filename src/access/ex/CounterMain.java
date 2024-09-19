package access.ex;

public class CounterMain {

    public static void main(String[] args) {

        MaxCounter maxCounter = new MaxCounter(3);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();

        int counter = maxCounter.getCounter();
        System.out.println(counter);
    }
}
