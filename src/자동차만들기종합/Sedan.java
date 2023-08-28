package 자동차만들기종합;

public class Sedan extends Car{
    public Sedan(String name) {
        this.name = name;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {

    }
}
