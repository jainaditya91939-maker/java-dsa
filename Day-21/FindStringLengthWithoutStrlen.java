import java.util.*;

class FindStringLengthWithoutStrlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int length = 0;

        for (char ch : str.toCharArray()) {
            length++;
        }

        System.out.println(length);
    }
}