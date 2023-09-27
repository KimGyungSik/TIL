package Chapter01;

public class Ex7_33 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner2 {
        int iiv = outerIv; // 외부 클래스의 private멤버도 접근 가능
        int iiv2 = outerCv;
    }
    static class StaticInner2 {
        // 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다
//        int siv = outerCv;
        static int scv = outerCv;
    }
    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부클래스의 지역변수는 fianl이 붙은 상수만 접근 가능
            int liv3 = lv; // JDK1.8부터 에러아님
            int liv4 = LV;
        }
    }
}
