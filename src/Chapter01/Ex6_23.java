package Chapter01;

public class Ex6_23 {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(); // 에러 => Data2클래스에는 매개변수가 있는 생성자가 있으므로 컴파일러가 기본생성자 추가를 안함
        System.out.println(d2.value);
    }       // 컴파일러가 자동으로 기본생성자를 추가해주는 경우는 클래스에 생성자가 하나도 없을때뿐이다
}
class Data1 {
    int value;
}

class Data2 {
    int value;
    Data2() {

    }

    Data2(int x) {
        value = x;
    }
}