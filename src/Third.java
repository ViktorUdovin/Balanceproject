public class Third {
    public static void main(String[] args) {
        int startBalance = -80;
        int receipt = 300;
        int balance = startBalance + receipt;
        int bonus = balance / 100;
        int mainReceipt = 1000;
        int badBalance = 0;


        if (receipt >= mainReceipt) {
            receipt = bonus;
        } else {
            receipt = badBalance;
        }


        if (balance <= badBalance) {
            receipt = badBalance;
        }


        System.out.println(receipt);
        System.out.println(balance);
    }
}



