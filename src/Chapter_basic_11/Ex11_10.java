package Chapter_basic_11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_10 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A ="+setA); // A =[1, 2, 3, 4, 5]

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B ="+setB);//B =[4, 5, 6, 7, 8]

//        setA.retainAll(setB); // 교집합 , 공통된 요소만 남기고 삭제
//        setA.addAll(setB); // 합집합, setB의 모든 요소를 추가(중복 제외)
//        setA.removeAll(setB); // 차집합, setB와 공통 요소를 제거
        // 교집합
         Iterator it = setA.iterator();// iterator메서드로 Iterator객체 생성
             while (it.hasNext()) { // 요소 하나하나 넘겨받아서 포함하고 있으면 setKyo에 요소추가
                 Object tmp = it.next();
                 if (setB.contains(tmp)) {
                     setKyo.add(tmp);
                 }
             }
                 // 차집합
                 it = setA.iterator();
                 while (it.hasNext()) {
                     Object tmp = it.next();
                     if (!(setB.contains(tmp))) {
                         setCha.add(tmp);
                     }
                 }
                 // 합집합
                 it = setA.iterator();
                 while (it.hasNext()) {
                     setHab.add(it.next());
                 }
                 it = setB.iterator();
                 while (it.hasNext()) {
                     setHab.add(it.next());
                 }

                 System.out.println("A∩B=" + setKyo);//A∩B=[4, 5]
                 System.out.println("A∪B=" + setHab);//A∪B=[1, 2, 3, 4, 5, 6, 7, 8]
                 System.out.println("A-B=" + setCha);//A-B=[1, 2, 3]

             }
    }

