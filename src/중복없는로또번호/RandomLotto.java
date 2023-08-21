package 중복없는로또번호;
// 1 ~ 45 사이의 임의의 수 6개를 생성해야 함. (입력은 받지 않음, Math.random() => 0.1 ~ 0.999
// int val = (int) ((Math.random() * 45) + 1;
// 단 중복 제거
// 생성된 val값을 배열에 담을 때 배열내에 해당하는 값이 있는 지 확인 필요.
// 배열은 6개
// 반복횟수는 정할 수 없음 (while(true) ==> 탈출 조건이 있어야 함 (중복되지 않은 번호 6개가 저장되면 break)

public class RandomLotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int val, index = 0;
        boolean isExist = false; // 중복 제거
        while (true) {
            val = (int)((Math.random() * 45) +1);
            for (int i = 0; i < 6; i++) {
                if (lotto[i] == val) isExist = true;
            }
            if(!isExist) lotto[index++] = val;
            if(index == 6) break;
            isExist = false;
        }
        for(int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
}
