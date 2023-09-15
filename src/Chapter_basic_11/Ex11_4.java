package Chapter_basic_11;

import java.util.*;

public class Ex11_4 {
    public static void main(String[] args) {
        //ArrayList c = new ArrayList();
        //HashSet c = new HashSet(); // Set은 Collection의 자손
        Collection c = new HashSet();
        //Collection c = new TreeSet();
        // 공통 조상의 타입으로 된 리모컨을 사용하면 실제 객체가 바뀌어도 아래의 코드검토할 필요X
        // Collection의 멤버만 쓴 것이 확실하기 떄문
        // 참조변수의 타입의 결정은 중요
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();
        // Iterator객체를 사용하면 컬렉션클래스가 바뀌어도 동일하게 동작함
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        // iterator는 1회용이라 다쓰고나면 다시 얻어와야 한다.
//        it = c.iterator();
//        while(it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }
        // Set은 get메서드가 없으므로 오류가남
//        for(int i=0; i<c.size(); i++) {
//            Object obj = c.get(i);
//            System.out.println(obj);
//        }
    }
}
