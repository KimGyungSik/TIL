package Chapter14;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {
    public static void main(String[] args) {
        Function<String,Integer> f = (s)->Integer.parseInt(s,16);
        Function<Integer,String> g = (i)->Integer.toBinaryString(i);

        Function<String,String> h = f.andThen(g);
        Function<Integer,Integer> h2 = f.compose(g);

        System.out.println(h.apply("FF"));// "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16

        Function<String,String> f2 = x -> x; // 항듬 함수
        System.out.println(f2.apply("AAA")); // AAA가 그대로 출력됨

        Predicate<Integer> p = i -> i <100;
        String str1 = new String("abc");
        String str2 = new String("abc");
        // str1과 str2가 같은지 비교한 결과를 반환
        //Predicate<String> p2 = Predicate.isEqual(str1);
        //boolean result = p2.test(str2);
        boolean result = Predicate.isEqual(str1).test(str2);
        System.out.println(result);
    }
}
