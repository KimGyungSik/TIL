package Chapter_basic_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Basic11_5 {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board = new int[5][5];

        for(int i=0; set.size()<25; i++) {
            set.add((int)(Math.random()*30)+1+"");
        }
        Iterator it = set.iterator();

        for(int i=0; i< board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next()); // next메서드는 Object타입의 객체를 반환하기 떄문에 String으로 형변환
                System.out.print((board[i][j]<10 ? " ": " ")+board[i][j]);
            }
            System.out.println();
        }
    }
}
