public class FindPairWithGivenSum {

    public static void findPair(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }

        System.out.println("No Pair Found");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        findPair(arr, 9);
    }
}