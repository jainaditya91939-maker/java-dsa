import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== JAVA QUIZ =====");

        // Question 1
        System.out.println("1. Which keyword is used to create an object?");
        System.out.println("a) class");
        System.out.println("b) new");
        System.out.println("c) object");
        System.out.println("d) create");

        char ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B')
            score++;

        // Question 2
        System.out.println("\n2. Java is a?");
        System.out.println("a) Programming Language");
        System.out.println("b) Database");
        System.out.println("c) Operating System");
        System.out.println("d) Browser");

        ans = sc.next().charAt(0);

        if (ans == 'a' || ans == 'A')
            score++;

        // Question 3
        System.out.println("\n3. Which package contains Scanner?");
        System.out.println("a) java.io");
        System.out.println("b) java.util");
        System.out.println("c) java.net");
        System.out.println("d) java.lang");

        ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B')
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        if (score == 3)
            System.out.println("Excellent!");
        else if (score == 2)
            System.out.println("Good Job!");
        else
            System.out.println("Keep Practicing!");

        sc.close();
    }
}