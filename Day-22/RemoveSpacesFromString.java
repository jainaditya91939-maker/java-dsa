import java.util.*;

class RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                ans.append(ch);
            }
        }

        System.out.println(ans);
    }
}