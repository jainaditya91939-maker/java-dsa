import java.util.*;

class LibraryManagement {
    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    books.add(sc.nextLine());
                    System.out.println("Book Added.");
                    break;

                case 2:
                    System.out.println("Books in Library:");
                    for (String book : books)
                        System.out.println(book);
                    break;

                case 3:
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    if (books.remove(name))
                        System.out.println("Book Removed.");
                    else
                        System.out.println("Book Not Found.");
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}