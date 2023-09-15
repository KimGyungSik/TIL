package Chapter_basic_11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_2 {  // 스택활용에 대한 예제
    public static void main(String[] args) {
        Stack s = new Stack(); // Stack 객체 생성
        String input = "((3+8)*(5+8))";

        try {
            for(int i=0; i<input.length(); i++) {
                char c = input.charAt(i); // 문자열의 문자하나하나를 뽑아내기

                if(c=='(') { // (를 만나면 스택에 저장
                    s.push(c);
                } else if (c==')') { // )를 만나면 스택에서 객체 뺴기
                    s.pop();
                }
            }
            if(s.isEmpty()) { // 스택이 비어있다면 괄호 일치
                System.out.println("괄호일치");
            }else {            // 아니면 괄호 불일치
                System.out.println("괄호불일치");
            }
        }catch (EmptyStackException e) { // )를 만나서 (를 뺴야하는데 비어있다면 예외발생
            System.out.println("괄호 불일치");
        }
    }
}
