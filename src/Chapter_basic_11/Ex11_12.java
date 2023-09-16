package Chapter_basic_11;

import java.util.TreeSet;

public class Ex11_12 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(); // 범위 검색에 유리.(from~to)

        String from = "b";
        String to =  "d";

        set.add("abc");
        set.add("dZZZZ");
        set.add("flower");
        set.add("bat");
        set.add("fan");

        System.out.println(set);
        System.out.println("range search : from "+from+" to "+to);
        System.out.println("result :"+set.subSet(from,to));
        System.out.println("result :"+set.subSet(from,to+"zzz"));
    }
}
