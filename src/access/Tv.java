package access;

public class Tv {

    private int channel = 3;

    void channelUp() {
        if (channel >= 5) {
            System.out.println("넘어갈 채널이 존재하지 않습니다.");
        } else {
            channel++;
        }
    }
}
