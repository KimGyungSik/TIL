package Chapter01;

import java.security.cert.PolicyNode;

public class jungsuk7_22 {
     static double sumArea(Shape2[] arr) {
         double sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum +=arr[i].calcArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape2[] arr = {new Circle2(5.0),new Rectangle(3,4),new Circle2(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}
abstract class Shape2 {
    Point2 p;
    Shape2() {
        this(new Point2(0,0));
    }
    Shape2(Point2 p) {
        this.p = p;
    }
    abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드

    Point2 getPosition() {
        return p;
    }
    void setPosition(Point2 p) {
        this.p = p;
    }
}
class Point2 {
    int x;
    int y;

    Point2() {
        this(0,0);
    }
    Point2(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}
class Circle2 extends Shape2 {
    double r;
    Circle2(double r) {
        this(new Point2(0,0),r);
    }
    Circle2(Point2 p, double r) {
        this.p = p;
        this.r = r;
    }
    double calcArea() {
        return Math.PI*r*r;
    }
}
class Rectangle extends Shape2 {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point2(0,0),width,height);
    }
    Rectangle(Point2 p,double width,double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width==height;
    }

    @Override
    double calcArea() {
        return width*height;
    }


}
