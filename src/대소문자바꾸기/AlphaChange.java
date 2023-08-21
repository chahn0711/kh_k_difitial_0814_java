package 대소문자바꾸기;
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// charAt(index) : 문자열에 해당 문자를 추출
// toCharArray() : 문자열을 문자 배열로 변환

import java.util.Scanner;
public class AlphaChange {
    public static void main(String[] args) {
        // 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 문자열 입력 받음
        System.out.print("문자열 입력 : ");
        String alpha = sc.next();
        // 문자열 길이 만큼 순회 하면서 문자에 대한 ASCII값 확인해서 대문자, 소문자 확인하고 계산해줌
        for (int i = 0; i < alpha.length(); i++) {
            char ch = alpha.charAt(i);
            if (ch < 'a') System.out.print((char) (ch + ('a' - 'A')));
            else System.out.print((char) (ch - ('a' - 'A')));
        }
    }
}
