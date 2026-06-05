import java.util.Scanner;

public class Primenumberinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers are:");

        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }

        sc.close();
    }
}
