import java.util.Scanner;

class MenuDrivenStringOperationsSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\n1. Length");
            System.out.println("2. Uppercase");
            System.out.println("3. Reverse");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println(str.toUpperCase());
                    break;

                case 3:
                    StringBuilder sb = new StringBuilder(str);
                    System.out.println(sb.reverse());
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}