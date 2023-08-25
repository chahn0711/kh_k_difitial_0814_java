package 디폴트메소드;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]Audio [2]TV : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Television();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            // 인터페이스 소속의 static 메소드
            RemoteControl.changeBattery();
        } else {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(30);
            rc.setMute(true);
        }
    }
}
