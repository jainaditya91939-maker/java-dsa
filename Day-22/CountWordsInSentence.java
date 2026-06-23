import java.util.*;

class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = str.split("\\s+");
        System.out.println(words.length);
    }
}