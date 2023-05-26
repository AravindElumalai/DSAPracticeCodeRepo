public class Pass {
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        int a = 90;
        int b = 100;
        swap();
        System.out.println(a + "" + b);

    }

    static void swap() {
        int temp = a;
        a = b;
        b = temp;
    }
}
