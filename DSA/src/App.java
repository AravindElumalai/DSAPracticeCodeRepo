import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arra = { 1, 2, 3, 4, 5 };
        int[] ans = new int[2 * arra.length];
        ans = arra;
        System.out.println(Arrays.toString(ans));
    }
}
