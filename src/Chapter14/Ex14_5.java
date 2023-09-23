package Chapter14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_5 {
    public static void main(String[] args) {
//        Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//        Function<String,Integer> f = 클래스이름::메서드이름;
//        Function<String,Integer> f = Integer::parseInt; // 메서드 참조
//        System.out.println(f.apply("100")+200); // 숫자 출력
        // ================================================
        // 생성자의 메서드참조
        // Supplier는 입력X, 출력O
//        Supplier<MyClass> s = ()-> new MyClass();
//        Supplier<MyClass> s = MyClass::new;
//        Function<Integer,MyClass> f = (i) -> new MyClass(i);
        Function<Integer,MyClass> f = MyClass::new;

        MyClass mc = f.apply(100); //MyClass객체를 만들어서 반환
        System.out.println(mc.iv);
        System.out.println(f.apply(200).iv); // 또 다른 객체생성

//        Function<Integer,int[]> f2 = (i)->new int[i]; 배열의 생성은 Function으로
        Function<Integer,int[]> f2 = int[]::new; // 메서드 참조
        System.out.println(f2.apply(100).length);
    }
}
class MyClass {
    int iv;
    MyClass(int iv) {
        this.iv = iv;
    }
}