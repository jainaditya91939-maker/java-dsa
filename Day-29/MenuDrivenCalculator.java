import java.util.Scanner;

class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            if (choice == 5)
                break;

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;
                case 2:
                    System.out.println("Result = " + (a - b));
                    break;
                case 3:
                    System.out.println("Result = " + (a * b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}