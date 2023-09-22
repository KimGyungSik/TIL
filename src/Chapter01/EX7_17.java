package Chapter01;

public class EX7_17 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println(p.x);
        p.method();
        System.out.println();
        System.out.println(c.x);
        c.method();
    }
}
class Parent {
    int x =100;
    void method() {
        System.out.println("Parent Method");
    }
}
class Child extends Parent {
    int x =200;

    @Override
    void method() {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(this.x);
    }
}