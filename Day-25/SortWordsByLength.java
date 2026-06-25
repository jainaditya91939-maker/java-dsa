import java.util.Arrays;

class SortWordsByLength {
    public static void main(String[] args) {

        String[] words = {"apple", "hi", "banana", "cat", "elephant"};

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        System.out.println(Arrays.toString(words));
    }
}