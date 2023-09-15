package Chapter_basic_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_3 {  //Queue를 활용한 예제
    static Queue q = new LinkedList(); // Queue는 인터페이스라 객체생성x , Queue를 구현한 LinkedList클래스 객체 생성
    static final int MAX_SIZE = 5; // Queue에는 5개까지만 저장가능
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다");

        while(true) {
            System.out.print(">>");
            try{
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input)) continue;

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.print("help-도움말을 보여줍니다");
                    System.out.print("q 또는 Q - 프로그램을 종료합니다");
                    System.out.print("history - 최근에 입력한 명령어를"+MAX_SIZE+"개 보여줍니다");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);

                    LinkedList list = (LinkedList)q;
                    final int SIZE = list.size(); // 5개로 고정이기 떄문에 상수로 고정

                    for(int i=0; i<SIZE; i++) {
                        System.out.println((i+1)+":"+list.get(i));
                    }
                } else {
                    save(input);
                    System.out.println(input);

                }

            }catch (Exception e) {
                System.out.println("입력오류입니다");
            }
        }
    }
    static void save(String input) {
        if(!("".equals(input))) { // if(input!=null && !input.equals("")를 합친 문장
            q.offer(input); // 큐에 input을 저장
        }

        if(q.size()>MAX_SIZE) {
            q.remove(); // 5개를 넘어가면 처음으로 들어간 객체 제거
        }
    }
}
