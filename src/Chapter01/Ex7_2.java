package Chapter01;

public class Ex7_2 {
    public static void main(String[] args) {
        Point[] p = { new Point(100,100), // Point타입의 객체배열 선언과 생성
                        new Point(140,50),
                        new Point(200, 100)
        };

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150), 50);

        t.draw();
        c.draw();
    }
}
class Shape {       // Shape클래스 생성
    String color = "black"; // 멤버변수 color는 black
    void draw() {           // draw메서드 생성
        System.out.printf("[color=%s]%n",color);
    }
}
class Point {  //Point 클래스 생성
    int x;      // 멤버변수 x,y 생성
    int y;
    Point(int x,int y) { // 매개변수가 있는 생성자 x,y값 받으면 인스턴스변수 초기화
        this.x = x;
        this.y = y;
    }
    Point() {    // 기본생성자 매개변수가 있는 생성자 호출
        this(0,0);
    }
    String getXY() { // getXY메서드 생성 인스턴스변수 반환
        return "("+x+","+y+")";
    }
}
class Circle extends Shape { // Shape를 상속한 Circle클래스 생성
    Point center; // Point타입의 참조형변수 선언
    int r; // 멤버변수 r 선언

    Circle() { // 기본생성자
        this(new Point(0,0),100); // 매개변수가 있는 생성자 호출
    }
    Circle(Point center, int r) { // 매개변수로 Point타입의 참조형변수, int형 변수 선언
        this.center = center;
        this.r = r;
    }
    void draw() { // draw메서드 오버라이딩
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n",center.x,center.y,r,color);
    }
}
class Triangle extends Shape { //Shape클래스를 상속한 Triangle클래스 생성
    Point[] p = new Point[3]; // Point타입의 객체배열 선언

    Triangle(Point[] p) { // 매개변수로 Point타입의 객체배열을 받는 생성자 생성
        this.p = p;
    }
    void draw() { // draw메서드 오버라이딩
        System.out.printf("[p1=%s, p2=%s, p3=%s,color=%s]%n",p[0].getXY(), p[1].getXY(),p[2].getXY(),color);
    }
}