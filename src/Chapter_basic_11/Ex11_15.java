package Chapter_basic_11;

import java.util.*;

public class Ex11_15 {
    public static void main(String[] args) {
        HashMap map = new HashMap(); // HashMap객체생성
        map.put("김자바",90);  // Entry형태로 "김자바",90 HashMap에 저장
        map.put("김자바",100); // key값 중복으로 김자바,100이 저장
        map.put("이자바",100); // "이자바",100
        map.put("강자바",80); // "강자바",80
        map.put("안자바",90); // "안자바",90
        //System.out.println(map);

        Set set = map.entrySet(); //Map인터페이스는 Collection인터페이스를 상속받지않았으므로 형변환, Map.Entry객체들의 집합으로 구성됨
        // 즉 Entry인터페이스를 구현한 객체들의 형태로 Set(집합)으로 구성된 것 => [안자바=90, 김자바=100, 강자바=80, 이자바=100]
       Iterator it = set.iterator();// iterator메서드 호출로 Iterator객체 생성

        //System.out.println(set);
        while (it.hasNext()) {// 요소가 없을때까지
            Map.Entry e = (Map.Entry) it.next();//it.next메서드로 반환되는 객체들은 Map.Entry객체들이기 떄문에 형변환가능한 것
            // Map = 인터페이스 Entry는 Map의 내부 인터페이스 // Entry인터페이스를 구현한 클래스의 객체를 반환
            System.out.println("이름 :" + e.getKey() + ", 점수 :" + e.getValue());
        }
        set = map.keySet();// HashMap에 저장되어 있는 모든 key값들을 Set으로 반환
        System.out.println("참가자 명단 :"+set);

        Collection values = map.values(); // HashMap에 저장되어 있는 모든 values들을 Collection으로 반환
         it  = values.iterator(); // iterator메서드 호출
        //System.out.println(values);
        int total = 0;
        // 총점 구하기
        while (it.hasNext()) {
            int num = (int)it.next();
            total += num;
        }
        System.out.println("총점: "+total);
        System.out.println("평균: "+(float)total/set.size());
        System.out.println("최고점수: "+Collections.max(values));
        System.out.println("최저점수: "+Collections.min(values));
        // Collections.max or min메서드의 인수값으로는 Comparable를 구현한 클래스의 객체만 들어올수있다.(비교기준제공)

    }
}
