package Chapter_basic_11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_6 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
            // return c2.compareTo(c1) * -1 도 가능
            // o1과 o2에는 문자열객체가 들어가므로, Comparable로 형변환
            // String클래스에 정의되어있는 compareTo메서에 -1을 곱하므로 역순정렬이 됨

        }
        return -1;
    }
}
