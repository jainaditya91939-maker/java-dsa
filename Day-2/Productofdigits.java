
import java.util.Scanner;

public class Productofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }

        System.out.println("Product of digits = " + product);
    }
}