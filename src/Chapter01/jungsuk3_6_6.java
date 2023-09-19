package Chapter01;

public class jungsuk3_6_6 { // 7번 문제까지

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }
}
class MyPoint {
    int x;
    int y;

    MyPoint(int x,int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1,int y1) {
        return Math.sqrt((x1-x)+(y1-y));
    }

}