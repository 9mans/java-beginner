package access;

public class SpeakerMain {

    public static void main(String[] args) {

        Speaker speaker = new Speaker(110);

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
//        speaker.volume = 300;
        speaker.showVolume();
    }
}
