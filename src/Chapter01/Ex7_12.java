package Chapter01;

public class Ex7_12 {
    public static void main(String[] args) {
        Card1 c = new Card1(12,"SPADE");
        //c.number = 5; 에러 생성자에서 초기화하기 때문
        System.out.println(c.number);
        System.out.println(c.kind);
        System.out.println(c);
    }
}
class Card1 {
    final int number;
    final String kind;

    Card1(int number,String kind) {
        this.number = number;
        this.kind = kind;
    }
    Card1() {
        this(10,"HEART");
    }
    public String toString() {
        return kind+","+number;
    }
}