package Chapter_basic_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Basic11_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이자바",2,1,70,80,100));
        list.add(new Student("인자바",2,2,60,50,50));
        list.add(new Student("홍길동",1,3,100,100,100));
        list.add(new Student("남궁성",1,1,90,70,80));
        list.add(new Student("김자바",1,2,100,70,80));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while ((it.hasNext()))
            System.out.println(it.next());
    }
}
class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student&& o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            Integer ban = s1.ban;
            Integer no = s1.no;
            Integer ban2 = s2.ban;
            Integer no2 = s2.no;
            return ban==ban2 ? no.compareTo(no2) : ban.compareTo(ban2);
            // return s1.ban==s2.ban ? s1.no - s2.no : s1.ban - s2.ban;
        }
        return -1;
    }
}
