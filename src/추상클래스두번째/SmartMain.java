package 추상클래스두번째;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("ipone pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("목업") { // 익명의 객체
            @Override
            void call() {
                System.out.println("목업폰이라 통화가 안돼요ㅠㅠ");
            }
        };
        phone.call();

    }
}
