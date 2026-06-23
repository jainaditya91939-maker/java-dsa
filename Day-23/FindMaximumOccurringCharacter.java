import java.util.*;

class FindMaximumOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ans = str.charAt(0);
        int max = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > max) {
                max = map.get(ch);
                ans = ch;
            }
        }

        System.out.println(ans);
    }
}