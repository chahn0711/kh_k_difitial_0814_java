package 디폴트메소드;

public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnON() {
        System.out.println("Television을 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Television을 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if (vol > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (vol < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 Television 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("TV 입니다.");
        System.out.println("현재 Television 볼륨은 " + volume);
    }
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("TV를 무음 처리 합니다.");
        else System.out.println("TV 무음 처리 해제 합니다.");
    }
}
