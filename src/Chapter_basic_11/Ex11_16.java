package Chapter_basic_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_16 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","A","Z","D"};

        HashMap map = new HashMap();// HashMap객체생성

      for(int i=0; i< data.length; i++) {// String배열의 길이만큼 반복
          if (map.containsKey(data[i])) {// key를 포함? 포함하면 기존의 value값+1 증가
              map.put(data[i], ((int)map.get(data[i]))+1);
          } else {
              map.put(data[i], 1);// 포함하지 않는다면 key-value(1)값으로 저장
          }
      }
       Set set = map.entrySet();  // Set객체 생성
        //System.out.println(set);
        Iterator it = set.iterator();// Iterator객체 생성

        while(it.hasNext()) {// 읽어 올 요소가 없을떄까지 확인
            Map.Entry e = (Map.Entry)it.next();// 요소 읽어오기
            Object value = e.getValue();// entry의 값(value)요소 읽어오기
            // it.next()가 반환하는 값이 Object형식으로 반환됨 따라서 반환된 Object를 실제로 저장된 데이터 타입인 int로 형변환해서 사용해야 함
            System.out.println(e.getKey()+":"+printBar('#',(int)value)+" "+value);
            // 키값 : printBar메서드호출 + " " + value값
        }
    }
    // printBar메서드생성 매개변수(char ch, int value) 반환타입 : String
    //value값 만큼 char형 배열 생성
    // 배열의 크기만큼 ch넣기
    // char배열을 문자열로 변환해서 리턴
    static String printBar(char ch,int value) {
        char[] c = new char[value];
        for(int i=0; i<c.length; i++) {
            c[i] = ch;
        }
        return new String(c);
    }

}
