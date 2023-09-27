package Chapter01;
//실행결과 : [p1=(100,100), p2=(140,50), p3=(200,100),color=black]
//          [center=(150, 150), r=50, color=black]

public class Ex7_2 {
    public static void main(String[] args) {
        Point1[] p = { new Point1(100,100), // Point타입의 객체배열 선언과 생성
                new Point1(140,50),
                new Point1(200, 100)
        };

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point1(150,150), 50);

        t.draw();
        c.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("color :"+color);
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return x+","+y;
    }

}

class Circle extends Shape {
    Point1 p;
    int r;
    Circle(Point1 p, int r) {
        this.p = p;
        this.r = r;
    }
    Circle() {
        this(new Point1(0,0),100);
    }
    void draw() {
        System.out.printf("[center(%d, %d), r = %d,color=%s]%n",p.x,p.y,r,color);
    }
}
class Triangle extends Shape {
    Point1[] p = new Point1[3];

    Triangle(Point1[] p) {
        this.p = p;
    }
    Triangle() {
    }

    @Override
    void draw() {
        System.out.printf("[p1 = (%s), p2=(%s), p3 = (%s), color=%s]%n",p[0],p[1],p[2],color);
                //[p1=(100,100), p2=(140,50), p3=(200,100),color=black]
    }
}