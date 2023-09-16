package Chapter_basic_11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_11 {
    public static void main(String[] args) {
        Set set = new TreeSet(new TestComp()); // 범위 검색, 정렬(정렬필요없음)
        //Set set = new TreeSet(); // 생성자에 아무것도 없는 것은 저장되는 객체가 비교기준이 있는 것
        // Set set = new HashSet(); //정렬 필요

//        for(int i=0; set.size()<6; i++) {
//            int num = (int)(Math.random()*45)+1;
//            //set.add(num); // set.add(new Integer(num)); Integer클래스는 compareTo메서드를 가지고있음
              set.add(new Test());
              set.add(new Test());
              set.add(new Test());
              set.add(new Test());
//        }
        System.out.println(set);
    }
}
// 저장되는 객체가 비교기준을 가지고 있던지, TreeSet생성자에 비교기준을 생성하던지 둘중에 하나를 선택해야함
class Test implements Comparable{
    public int compareTo(Object o) {
        return -1;
    }
} // TreeSet은 비교기준이 필요함

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}