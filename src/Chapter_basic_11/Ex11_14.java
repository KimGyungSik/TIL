package Chapter_basic_11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_14 {
    public static void main(String[] args) {
       HashMap map = new HashMap();// HashMap객체생성
        map.put("myId","1234");// "myId","1234" Entry형태로 HashMap에 저장
        map.put("asdf","1111");// "asdf","1111" Entry형태로 HashMap에 저장
        map.put("asdf","1234");// 키값이 똑같을 떄 출력시 value값만 제일 마지막에 넣은 value값이 출력됨
        //System.out.println(map);

       Scanner s = new Scanner(System.in);
        // id값 입력시 공백없이
        // password값 입력시 공백없이
        while (true) {
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id :");
            String id = s.nextLine().trim();

            if(!(map.containsKey(id))) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }
            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if((map.get(id)).equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다");
                break;
            }else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
            }
        }


    }
}
