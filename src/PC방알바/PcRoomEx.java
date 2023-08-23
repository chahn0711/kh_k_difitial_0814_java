package PC방알바;

import java.util.Scanner;

// 인원 수
// 예약할 좌석 번호 100개
// 결과는 거절 횟수 출력
public class PcRoomEx {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 인원수를 입력 받음
        for(int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1)rejectCnt++;
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(rejectCnt);
    }
}
