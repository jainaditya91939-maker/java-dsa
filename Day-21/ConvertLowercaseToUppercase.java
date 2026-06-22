import java.util.*;

class ConvertLowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                ans.append((char)(ch - 32));
            else
                ans.append(ch);
        }

        System.out.println(ans);
    }
}
