package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {

        int volume = 0;
        boolean isOn = false;

        // 실행
        isOn = true;
        System.out.println("실행합니다.");

        //소리크게
        volume++;
        System.out.println(volume);
        //소리크게
        volume++;
        System.out.println(volume);
        //소리작게
        volume--;
        System.out.println(volume);
        //상태
        if (isOn) {
            System.out.println("실행중");
        } else {
            System.out.println("꺼짐");
        }
        //종료
        isOn = false;
        System.out.println("종료합니다.");

    }
}
