package Chapter14;

public class Ex14_1 {
    static void execute(MyFunction1 f) { //매개변수의 타입이 MyFunction인 메서드
        f.run( 3, 2);
    }
    static MyFunction1 getMyFunction() { // 반환 타입이 MyFunction인 메서드
        //MyFunction1 f = () -> System.out.println("f3.run()");
        //return f;
        return (int a,int b) -> System.out.println(a+b);
    }
    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction1 f1 = (int a,int b)-> System.out.println(a*b);

        MyFunction1 f2 = new MyFunction1() { // 익명클래스로 run()을 구현
            @Override
            public void run(int a, int b) {
                System.out.println(a-b);
            }
        };
        MyFunction1 f3 = getMyFunction();

        f1.run(5,5);
        f2.run(10 ,7);
        f3.run(5,5);

        execute(f1);
        execute((int y,int x)-> System.out.println(y+x));
    }
}
@FunctionalInterface
interface MyFunction1 {
    void run(int a,int b); // public abstract void run();
}