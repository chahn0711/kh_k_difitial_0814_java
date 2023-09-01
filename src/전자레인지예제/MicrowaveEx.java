package 전자레인지예제;
// 5분(300) 버튼, 1분(60) 버튼, 10초 버튼
// 최소 횟수를 눌러서 요리 시간을 설정하는 문제
// 시간을 맞출 수 없으면 -1 반환
import java.util.Scanner;

public class MicrowaveEx {
    public static void main(String[] args) {
        int t, a, b, c; // 요리시간을 초로 입력, a = 5분, b = 1분, c = 10초
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        if(t % 10 != 0) {
            System.out.println("-1");
            return;
        }
        a = t / 300; // 5분 버튼에 대한 몫 (5분 버튼이 눌려진 수)
        b = t % 300 / 60; // 1분 버튼이 눌려진 수
        c = t % 300 / 60 / 10; // 10초 버튼이 눌려진 수
        System.out.printf("%d %d %d\n", a,b,c);
    }
}
