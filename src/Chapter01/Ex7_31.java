package Chapter01;

public class Ex7_31 {
    class InstanceInner {
        int iv =100;
        static int cv = 100; // static변수를 선언할 수 없음
        final static int CONST = 100; // 상수는 허용
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
        class LocalInner {
            int iv = 300;
            static int cv = 300; // static변수를 선언할 수 없음
            final static int CONST = 300; // 상수 허용
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
