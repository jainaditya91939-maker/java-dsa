import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int size = removeDuplicates(arr);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, size)));
    }
}