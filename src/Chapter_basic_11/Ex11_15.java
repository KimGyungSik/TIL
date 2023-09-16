package Chapter_basic_11;

import java.util.*;

public class Ex11_15 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바",90);
        map.put("김자바",100); // key값 중복으로 김자바,100이 저장
        map.put("이자바",100);
        map.put("강자바",80);
        map.put("안자바",90);
        System.out.println(map);
        Set set = map.entrySet(); //Map인터페이스는 Collection인터페이스를 상속받지않았으므로 형변환
        Iterator it = set.iterator();

        System.out.println(set);
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            // Map = 인터페이스 Entry는 Map의 내부 인터페이스
            System.out.println("이름 :"+e.getKey()+", 점수 :"+e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : "+set);

        Collection values = map.values();
        it = values.iterator();
        System.out.println(values);
        int total = 0;

        while ((it.hasNext())) {
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점: "+total);
        System.out.println("평균: "+(float)total/set.size());
        System.out.println("최고점수: "+Collections.max(values));
        System.out.println("최저점수: "+Collections.min(values));
        // Collections.max or min메서드의 인수값으로는 Comparable를 구현한 클래스의 객체만 들어올수있다.(비교기준제공)

    }
}
