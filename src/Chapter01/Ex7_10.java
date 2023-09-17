package Chapter01;

public class Ex7_10 {
    public static void main(String[] args) {
        Object[] group = {new Marine(), new Tank(), new Dropship()};

        for(int i =0; i< group.length; i++) {
            if(group[i] instanceof Unit) { // Object클래스에는 move메서드가 없음
                Unit u = (Unit) group[i]; // 추상클래스인 Unit클래스를 구현한 클래스의 객체를 Unit타입으로 형변환
                // Unit클래스에는 move메서드가 존재하므로
                u.move(200,300); // 참조변수 u는 실제 객체의 move메서드 호출
            }
        }
    }
}

abstract class Unit {
    int x,y;
    abstract void move(int x,int y);
    void stop() {};

}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println(x+","+y);
    }
}
class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println(x+","+y);
    }
}
class Dropship extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println(x+","+y);
    }
}