import java.util.Arrays;

public class SortArrayInDescendingOrder {

    public static void sortDescending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        sortDescending(arr);

        System.out.println(Arrays.toString(arr));
    }
}