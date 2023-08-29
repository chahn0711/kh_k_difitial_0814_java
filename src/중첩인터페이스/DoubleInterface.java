package 중첩인터페이스;
// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스 입니다.
// 중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트 처리를 목적으로 사용
public class DoubleInterface {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListerner(new CallListener());
        btn.touch(); // 전화를 겁니다. 출력
        btn.setOnClickListerner(new MessageListener());
        btn.touch(); // 메시지를 보냅니다. 출력
    }
}
