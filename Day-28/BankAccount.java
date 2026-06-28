import java.util.*;

class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        while (true) {

            System.out.println("\n===== Bank Account =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    balance += sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance -= amount;
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.println("Balance = " + balance);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}