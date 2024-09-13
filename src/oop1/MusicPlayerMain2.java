package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData musicPlayerData = new MusicPlayerData();

        // 실행
        on(musicPlayerData);

        //소리크게
        volumeUp(musicPlayerData);
        //소리크게
        volumeUp(musicPlayerData);
        //소리작게
        volumeOff(musicPlayerData);
        //상태
        getStatus(musicPlayerData);
        //종료
        off(musicPlayerData);
    }

    static void on(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = true;
        System.out.println("실행합니다.");
    }

    static void off(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = false;
        System.out.println("종료합니다.");
    }

    static void volumeUp(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume++;
        System.out.println("볼륨업:" + musicPlayerData.volume);
    }
    static void volumeOff(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume--;
        System.out.println("볼륨낮추기:" + musicPlayerData.volume);
    }

    static void getStatus(MusicPlayerData musicPlayerData) {
        if (musicPlayerData.isOn) {
            System.out.println("실행중");
        } else {
            System.out.println("꺼짐");
        }
    }
}
