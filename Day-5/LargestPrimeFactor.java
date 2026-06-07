import java.util.Scanner;

public class LargestPrimeFactor {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestPrimeFactor = -1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}
