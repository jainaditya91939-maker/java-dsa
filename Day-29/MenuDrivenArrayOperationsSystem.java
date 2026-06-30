import java.util.Arrays;
import java.util.Scanner;

class MenuDrivenArrayOperationsSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        while (true) {
            System.out.println("\n1. Display");
            System.out.println("2. Sum");
            System.out.println("3. Maximum");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(Arrays.toString(arr));
                    break;

                case 2:
                    int sum = 0;
                    for (int num : arr)
                        sum += num;
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int num : arr)
                        if (num > max)
                            max = num;
                    System.out.println("Maximum = " + max);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}