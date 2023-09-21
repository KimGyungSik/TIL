package Chapter01;

public class Ex7_14 {
    public static void main(String[] args) {
        //Singleton s = new Singleton();
        Singleton s= Singleton.getInstance();
    }
}
final class Singleton {
    private  static Singleton s = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance() {
        if(s==null) return s = new Singleton();
        return s;
    }
}