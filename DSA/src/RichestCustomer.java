public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 4, 7, 8 } };
        int highestWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int individualWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                individualWealth = individualWealth + accounts[i][j];
            }
            if (individualWealth > highestWealth) {
                highestWealth = individualWealth;
            }
        }
        System.out.println(highestWealth);
    }
}
