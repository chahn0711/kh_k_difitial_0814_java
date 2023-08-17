package 성적프로그램;
// 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
// 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
// [옵션] 성적이 잘 못 입력 되었으면 재 입력 요구
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 입력을 받아서 정수형 변수에 대입
        // 조건문을 만드는데 우선, 0 ~ 100 사이의 정상적인 입력인지 확인
       while (true) {
           System.out.println("성적을 입력 하세요 : ");
           int score = sc.nextInt();
            if(score < 0 || score > 100) continue;
            if (score >= 90) System.out.println("A");
            else if (score >= 80) System.out.println("B");
            else if (score >= 70) System.out.println("C");
            else if (score >= 60) System.out.println("D");
            else System.out.println("F");
            break;

       }
    }
}


