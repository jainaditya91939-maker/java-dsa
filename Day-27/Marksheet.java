import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student Details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        // Marks
        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int computer = sc.nextInt();

        System.out.print("Enter marks in Hindi: ");
        int hindi = sc.nextInt();

        // Calculation
        int total = english + maths + science + computer + hindi;
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "F";

        // Result
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);

        System.out.println("\nMarks:");
        System.out.println("English  : " + english);
        System.out.println("Maths    : " + maths);
        System.out.println("Science  : " + science);
        System.out.println("Computer : " + computer);
        System.out.println("Hindi    : " + hindi);

        System.out.println("\nTotal Marks : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);

        if (percentage >= 40)
            System.out.println("Result      : PASS");
        else
            System.out.println("Result      : FAIL");

        sc.close();
    }
}