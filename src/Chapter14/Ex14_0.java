package Chapter14;

public class Ex14_0 {
    public static void main(String[] args) {
        // Object obj = (a,b) -> a > b ? a : b; // 람다식, 익명객체
        // 아래의 코드와 똑같음
        //Object obj = new Object() {
          //  int max(int a,int b) {
            //    return a > b ? a:b;
            //}
        //};
        //int value = obj.max(3,5); // 함수형 인터페이스, Object클래스에는 max메서드가 없음
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못바꿈
//                return a > b? a:b;
//            }
//        }
        // 람다식(익명 객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다
        MyFunction f = (a,b) -> a>b ? a:b; // 람다식. 익명객체
        // 람다식을 이용해서 추상메서드를 호출한 것
        int value = f.max(3,5); // 함수형 인터페이스
        System.out.println("value="+value);
    }
}
@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야함.
interface MyFunction {
    //public abstract int max(int a,int b);
    int max(int a,int b); // public abstract가 생략된것
}