package TV기본예제;

public class TV {
    private boolean isON; // TV 전원
    private int channel; // 채널
    private int volume; // 볼륨

    TV() {
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch, int vol) {
        this.isON = isON;
        channel = ch;
        volume = vol;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    public void setON(boolean isON) {
        this.isON = isON;
    }
}
