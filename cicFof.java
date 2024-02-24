public class cicFof {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
        System.out.println();
    }

    public static void test2() {
        for (int x = 10; x < 15; x = x + 1) {
            System.out.print(x);
            System.out.println();

        }
    }

    public static void test3() {
        for (int i = 3; i >= -3; i--) {
            System.out.print(i+" ");
            

        }
    }

}
