public class Main {

    public static void main(String[] args) {
        int startbalance = 130;
        int receipt = 1200;
        int balance = startbalance + receipt;
        int fullbalance = startbalance + receipt;
        int bonus = balance / 100;
        int nobonus = 0;
        int mainreceipt = startbalance + 1000;
        int badbalance = 0;

        if (balance >= mainreceipt) {
            balance = bonus;
        }

        else if (balance <= mainreceipt) {
            balance = nobonus;
        }


            if (balance <= badbalance) {
                balance = nobonus;
            }


            System.out.println(balance);
            System.out.println(fullbalance);
        }
    }


