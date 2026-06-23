import java.util.*;

class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println(ch);
                return;
            }
            set.add(ch);
        }

        System.out.println("No repeating character");
    }
}