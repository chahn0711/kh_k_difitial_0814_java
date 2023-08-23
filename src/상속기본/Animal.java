package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
// Animal을 상속 받아 Dog 클래스를 만듬
class Dog extends Animal { // class는 여러개 둘 수 있으나 public은 하나만 가능
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    void sleep() { // 오버라이딩
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) { // 오버로딩
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}
