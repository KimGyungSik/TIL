package Chapter01;

import java.util.Vector;

public class Ex7_18 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
//        b.buy(new SmartTv());
//        b.buy(new Computer());
//        b.buy(new Audio());
        SmartTv t = new SmartTv();
        Computer c = new Computer();
        Audio a = new Audio();

        b.buy(t);
        b.buy(c);
        b.buy(a);
        b.summary();
        System.out.println();
        b.refund(c);
        b.summary();
    }
}
class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class SmartTv extends Product2 {
    SmartTv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product2 {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
class Audio extends Product2 {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    //Product2[] item = new Product2[10];
    // int i = 0;

    Vector item = new Vector(); // 10개의 객체를 저장할 수 있는 Vector인스턴스 생성 10개 이상시 자동적으로 크기증가

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p); // 구입한 제품을 Vector에 저장
        //   item[i++] = p;
        System.out.println(p + "를 구입하셨습니다");
    }

    // 구입한 제품을 환불하는 메서드
    void refund(Product2 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "를 반품하셨습니다");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다");
        }
    }
    void summary () {
            int sumList = 0;
            String itemList = "";

            if (item.isEmpty()) {
                System.out.println("구입하신 제품이 없습니다");
                return;
            }
            for (int i = 0; i < item.size(); i++) {
                Product2 p1 = (Product2) item.get(i);
                sumList += p1.price;
                itemList += (i == 0) ? "" + p1 : ", "+p1;
            }

//        for(int i=0; i<item.length; i++) {
//            if(item[i]==null) break;
//            sumList += item[i].price;
//            itemList += item[i]+",";

            System.out.println(sumList);
            System.out.println(itemList);
        }
    }

