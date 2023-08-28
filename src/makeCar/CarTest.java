package makeCar;

public class CarTest {
    int speed;
    int fuelEff;
    int tankSize;
    int seats;
    String carName;
    int moveNum;
    boolean isOption;

    public String getCarName() {
        return carName;
    }
    public int moveNum (int peopleNum) {
        if (peopleNum % seats == 0) moveNum = peopleNum / seats;
        else moveNum = ( peopleNum / seats ) + 1;
        return moveNum;
    }

    public int oilingNum (int distance) {
        int oilingNum;
        if ((distance / fuelEff * moveNum) % tankSize == 0) {
            oilingNum = distance / tankSize * moveNum / fuelEff;
        } else oilingNum = distance / tankSize * moveNum / fuelEff + 1;
        return oilingNum;
    }

    public int totalCost(int distance) {
        return (moveNum * distance / fuelEff) * 2000;
    }

    public int totalTime(int distance) {
        return (distance / speed) * moveNum;
    }

    public void choiceOption(boolean isOption) {}
}