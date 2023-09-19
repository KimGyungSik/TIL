package Chapter01;

public class Ex6_21 {
    public static void main(String[] args) {
        System.out.println("int add(int a, int b) - int add(3,3) 결과:" + add(3,3));
        System.out.println("int add(long a, int b) - int add(3L,3) 결과:" + add(3L,3));
        System.out.println("int add(int a, long b) - int add(3,3L) 결과:" + add(3,3L));
        System.out.println("int add(long a, long b) - int add(3L,3L) 결과:" + add(3L,3L));
        int[] a = {100,200,300};
        System.out.println("int add(int[] a) - int add(a) 결과:" + add(a));
    }
    static int add(int a, int b) {
        return a+b;
    }
    static int add(long a, int b) {
        return (int) (a+b);
    }
    static int add(int a,long b) {
        return (int)(a+b);
    }
    static int add(long a,long b) {
        return (int) ((int)a+b);
    }

    static int add(int[] a) {
        int result = 0;
        for(int i=0; i<a.length; i++) {
            result +=a[i];
        }
        return result;
    }
}
