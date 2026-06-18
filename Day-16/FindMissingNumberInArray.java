public class FindMissingNumberInArray {

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        System.out.println(findMissing(arr));
    }
}