public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("After increment::" + i);
        }
        for (int i = 0; i < 10; ++i) {
            System.out.println("Before incerment::" + i);
        }
    }
}
