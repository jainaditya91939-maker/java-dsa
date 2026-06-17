import java.util.Arrays;

public class RotateArrayRight {

    public static void rotateRight(int[] arr) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateRight(arr);

        System.out.println(Arrays.toString(arr));
    }
}