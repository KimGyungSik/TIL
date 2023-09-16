package Chapter_basic_11;

import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        // Set set = new TreeSet()으로는 headSet메서드나 tailSet메서드를 쓰지못함
        // Set인터페이스에는 저 메서드들이 존재하지않기떄문
        int[] score = {80,95,50,35,45,65,10,100};

        for(int i=0; i< score.length; i++) {
            set.add(score[i]);
        }
        System.out.println("50보다 작은 값 :"+set.headSet(50));
        System.out.println("50보다 큰 값 :"+set.tailSet(50));
        System.out.println("40과 80사이의 값 :"+set.subSet(40,80));
    }
}
