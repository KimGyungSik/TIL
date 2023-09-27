package Chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            list.add(i);
        }
        //list의 모든 요소들을 출력
        list.forEach(i -> System.out.print(i+","));
        //System.out.println(list);
        //Iterator it = list.iterator();
        //while (it.hasNext()) {
        //    System.out.println(it.next());
        //}

        System.out.println();

        //void replaceAll(UnaryOperator<E> operation> => 모든 요소를 변환하여 대체
        list.replaceAll(i-> i+2);
        System.out.println(list);

        //list에서 2 또는 3의 배수를 제거한다.
        list.removeIf(x -> x%2==0 || x%3==0);
        System.out.println(list);

        list.replaceAll(i -> i*10); // list의 각 요소에 10을 곱한다.
        System.out.println(list);

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        //map의 모든 요소를 {k , v}의 형식으로 출력한다.
        map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));

       // Iterator it = map.entrySet().iterator();
        //while (it.hasNext()) {
          //  System.out.println(it.next());

        //void replaceAll(BiFunction <K,V,V> ) => 모든 요소에 치환작업 f를 수행
        map.replaceAll((k,v) -> k+v);
        System.out.println(map);
        //V merge(K key, V value, BiFunction<V,V,V> f) => 모든 요소에 병합작업 f를 수행
        map.merge("1","1",(k,v)-> v+String.valueOf(5) );
        System.out.println(map);
        // V computeifPresent(K key, BiFunction(K,V,V> f) => 지정된 키가 있을 떄 작업 f를 수행
        map.computeIfPresent("2",(k,v)-> v+"2번째");
        System.out.println(map);

        }
    }

