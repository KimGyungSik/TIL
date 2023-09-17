package Chapter_basic_11;

import java.util.HashSet;
import java.util.Objects;

public class Basic11_4 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard) {
            SutdaCard c = (SutdaCard) obj;
            return num==c.num&&isKwang==c.isKwang;
        }else {
            return false;
        }
    }
    public int hashCode() {
        return Objects.hash(num,isKwang);
        // return toString().hashCode();
        // String클래스의 hashCode()는 객체의 주소가 아닌 문자열의 내용을 기반으로 해시코드를 생성
        // 인스턴스변수들의 값을 결합한 문자열을 만들고, 그 문자열에 대해 hashCode()를 호출하는 방법은 쉬우면서도 효과적
    }
    public String toString() {
        return num + (isKwang ? "K":"");
    }

}