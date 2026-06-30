import java.util.Scanner;

class MiniProject {

    static String[] tasks = new String[5];
    static int count = 0;

    static void addTask(String task) {
        if (count < tasks.length) {
            tasks[count++] = task;
            System.out.println("Task Added");
        } else {
            System.out.println("Task List Full");
        }
    }

    static void viewTasks() {
        if (count == 0) {
            System.out.println("No Tasks");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task: ");
                    addTask(sc.nextLine());
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}