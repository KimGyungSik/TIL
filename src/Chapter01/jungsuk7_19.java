package Chapter01;

public class jungsuk7_19 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Tv2());
        b.buy(new Audio2());
        b.buy(new Computer2());
        b.buy(new Computer2());
        b.buy(new Computer2());
        b.summary();
    }
}
class Buyer2 {
    int money = 1000;
    Product1[] cart = new Product1[3];
    int i=0;
    void buy(Product1 p) {
        if(money < p.price)  {
            System.out.println("잔액이 부족하여"+p+"를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }
    void add(Product1 p) {
            if(i>= cart.length) {
                Product1[] cart2 = new Product1[cart.length*2];
                System.arraycopy(cart,0,cart2,0,cart.length);
                cart = cart2;
            }
            cart[i++] = p;
    }
    void summary() {
        int sumList = 0;
        String allList = "";
        for(int i=0; i< cart.length; i++) {
            if(cart[i]==null) break;
            sumList += cart[i].price;
            allList += cart[i]+",";

        }
        System.out.println("구입한 물건:"+allList);
        System.out.println("사용한 금액:"+sumList);
        System.out.println("남은 금액"+money);
    }

}
class Product1 {
    int price;
    Product1(int price) {
        this.price = price;
    }
}
class Tv2 extends Product1 {
    Tv2() {
        super(100);
    }
    public String toString() {
        return "TV";
    }
}
class Computer2 extends Product1 {
    Computer2() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio2 extends Product1 {
    Audio2() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}