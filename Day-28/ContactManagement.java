import java.util.*;

class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> contacts = new HashMap<>();

        while (true) {

            System.out.println("\n===== Contact Management =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    contacts.put(name, phone);
                    System.out.println("Contact Added.");
                    break;

                case 2:
                    for (Map.Entry<String, String> entry : contacts.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String search = sc.nextLine();

                    if (contacts.containsKey(search))
                        System.out.println("Phone: " + contacts.get(search));
                    else
                        System.out.println("Contact Not Found");
                    break;

                case 4:
                    System.out.print("Enter Name: ");
                    String delete = sc.nextLine();

                    contacts.remove(delete);
                    System.out.println("Contact Deleted");
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}