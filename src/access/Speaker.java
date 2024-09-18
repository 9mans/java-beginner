package access;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {

        if (volume >= 100) {
            System.out.println("볼륨 최대치");
        } else {
            System.out.println("볼륨 증가");
            volume += 10;
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 내리기");

    }

    void showVolume() {
        System.out.println(volume);
    }

}
