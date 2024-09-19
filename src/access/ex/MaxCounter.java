package access.ex;

public class MaxCounter {

    private int counter;
    private int max;

    public MaxCounter(int max) {

        this.max = max;
    }

    public void increment() {
        if (counter >= max) {
            System.out.println("최대값을 초과하지 못합니다");
            return;
        }
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
