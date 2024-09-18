package oop1;

import construct.MemberConstruct;

public class MusicPlayer {

    int volume;
    boolean isOn;

    public void on() {
        isOn = true;
        System.out.println("실행");
    }

    public void off() {
        isOn = false;
        System.out.println("종료");
    }

    public void up() {
        volume++;
        System.out.println("소리+" + volume);
    }

    public void down() {
        volume--;
        System.out.println("소리-"  + volume);
    }

    public void showStatus() {
        if (isOn) {
            System.out.println("실행중");
        } else {
            System.out.println("---");
        }
    }
}
