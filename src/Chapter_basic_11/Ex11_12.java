package Chapter_basic_11;

import java.util.TreeSet;

public class Ex11_12 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(); // 범위 검색에 유리.(from~to)
//
//        String from = "b";
//        String to =  "d";

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println(set);
        System.out.println("range search : from "+"a+"+ "to "+"e");
        System.out.println("result :"+set.subSet("a","d"));
        System.out.println("result :"+set.subSet("a","e"));
    }
}
