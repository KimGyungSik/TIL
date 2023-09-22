package Chapter01;

public class Ex7_15 {
    public static void main(String[] args) {
//        Car2 car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//
//        fe.water();
//        car = fe;
//        car.water(); // error Car2에는 water메서드가 없음
//        fe2 = (FireEngine) car;
//        fe2.water();
        Car2 car = new Car2();
        Car2 car2 = null;
       FireEngine fe = null;

        car.drive();
//        fe = (FireEngine) car; // 컴파일 ok, 실행시 에러남 실제 인스턴스는 Car2의 인스턴스이기 떄문에 자손타입의 참조변수로 형변환 불가능
 //       fe.drive();
 //       car2 = fe;
        car2.drive();
    }
}
class Car2 {
    String color2;
    int door2;

    void drive() {
        System.out.println("dirve.drr");
    }
}
class FireEngine extends Car2 {
    void water() {
        System.out.println("water!!");
    }
}