import java.util.*;

class TicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 10;

        while (true) {

            System.out.println("\n===== Ticket Booking =====");
            System.out.println("Available Seats: " + seats);

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("How many tickets? ");
                    int book = sc.nextInt();

                    if (book <= seats) {
                        seats -= book;
                        System.out.println("Booking Successful");
                    } else {
                        System.out.println("Not Enough Seats");
                    }
                    break;

                case 2:
                    System.out.print("How many tickets to cancel? ");
                    int cancel = sc.nextInt();

                    seats += cancel;
                    System.out.println("Cancellation Successful");
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}