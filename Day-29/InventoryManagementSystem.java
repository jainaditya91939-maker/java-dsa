import java.util.Scanner;

class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Pen", "Book", "Laptop"};
        int[] quantity = {10, 20, 5};

        while (true) {
            System.out.println("\n1. View Inventory");
            System.out.println("2. Update Quantity");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i] + " : " + quantity[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter Item Index (0-2): ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < items.length) {
                        System.out.print("Enter New Quantity: ");
                        quantity[index] = sc.nextInt();
                    } else {
                        System.out.println("Invalid Index");
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}