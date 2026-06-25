import java.util.HashSet;

class FindCommonCharactersInStrings {
    public static void main(String[] args) {

        String s1 = "programming";
        String s2 = "gaming";

        HashSet<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1) {
                set.add(ch);
            }
        }

        System.out.println(set);
    }
}