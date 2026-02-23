public class A extends B {

    static int a;

    public static void test() {
        b = 60;
        a = b;
        System.out.println("Test method of a");
    }

    static {
        a = 20;
        b = 30;
        System.out.println("Static block of A");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        test1();
        test();
        System.out.println(a);
        System.out.println(b);
    }
}
