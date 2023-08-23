package This에대해서;

public class Car {
    private String model; // 자동차 명
    private int year; // 출고 연도
    private String color; // 색상
    private int maxSpeed; // 최고 속도
    Car() {}
    Car(String model) {
        this(model,2022,"black",230);
    }
    Car(String model, int year, String color, int speed) {
        this.model = model; // this는 생략도 가능하나 구분하기 위해서 쓴다?
        this.year = year;
        this.color = color;
        maxSpeed = speed;

    }
}
