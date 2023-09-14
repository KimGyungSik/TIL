package Chapter01;

public class Ex5_7 {
    public static void main(String[] args) {
//        if(args.length!=1) {
//            System.out.println("USAGE: java Exercise5_7 3120");
//            System.exit(0);
//        }
        String s = "3510";
        int money = Integer.parseInt(s);

        System.out.println("money="+money);

        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;

            coinNum = money/coinUnit[i];
            if(coinNum>coin[i]) {
                coinNum = coin[i];
                coin[i] = 0;
            }else {
                coin[i] = coin[i] - coinNum;
            }
            money = money - coinNum*coinUnit[i];
            System.out.println(coinUnit[i]+"원 : "+coinNum);
        }
        if(money > 0) {
            System.out.println(" 거스름돈이 부족합니다.");
            System.exit(0); // . 프로그램을 종료한다
        }
        System.out.println("=남은 동전의 개수 =");

        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+"원 :"+coin[i]);
        }
    } // main
}

