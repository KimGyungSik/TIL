package Chapter01;

public class Ex6_20 {
    public static void main(String[] args) {
        MemberCall mm = new MemberCall();
        mm.iv = 20;
        int value = new MemberCall().iv;
        System.out.println(value);
    }
}
class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv; //에러 클래스변수는 iv호출 못함
    static int cv2 = new MemberCall().iv; // 객체 생성후 호출가능

    static void staticMethod1 () {
        System.out.println(cv);
//        System.out.println(iv); // iv호출불가 에러
        MemberCall mm = new MemberCall();
        System.out.println(mm.iv); // 객체를 생성후에야 iv호출 가능
        System.out.println(new MemberCall().iv); // 위에 두 줄과 같음
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }
    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1(); // 에러 클래스메서드에서는 인스턴스메서드 호출 불가
        MemberCall mm = new MemberCall();
        mm.instanceMethod1(); // 인스턴스 생성 후에야 인스턴스메서드 호출가능
    }

    void instanceMethod2() { //인스턴스메서드에서는 둘다 호출 가능
        staticMethod1();
        instanceMethod1();
    }

}