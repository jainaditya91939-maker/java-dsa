import java.util.Scanner;

class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++"};
        boolean[] issued = new boolean[3];

        while (true) {
            System.out.println("\n1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < books.length; i++) {
                        System.out.println(i + ". " + books[i] + " - "
                                + (issued[i] ? "Issued" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Index: ");
                    int index = sc.nextInt();

                    if (!issued[index]) {
                        issued[index] = true;
                        System.out.println("Book Issued");
                    } else {
                        System.out.println("Already Issued");
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