package 쓰레드예제4번;

import static java.lang.Thread.sleep;

// 쓰레드를 안전하게 종료하기, stop() 메소드는 사용 중지 됨
public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();

        sleep(1000);
//        runThread.setStop(true);
    }
}

class RunThread extends Thread {
//    private boolean stop; // stop 플래스 설정
//
//    public void  setStop(boolean stop) {
//        this.stop = stop;
//    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 실행 중.....");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("자원 정리...");
        System.out.println("실핼 종료...");
    }
}
