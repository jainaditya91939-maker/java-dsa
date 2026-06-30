import java.util.Scanner;

class MiniEmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Rahul", "Amit", "Neha"};
        int[] salary = {30000, 35000, 40000};

        while (true) {
            System.out.println("\n1. View Employees");
            System.out.println("2. Update Salary");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < names.length; i++) {
                        System.out.println(names[i] + " - " + salary[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee Index: ");
                    int index = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    salary[index] = sc.nextInt();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}