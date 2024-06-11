public class Kadanes_Algorithm {

    public static int kadane_algo(int[] arr) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (curSum < 1) {
                curSum = 0;
            }

            maxSum = Math.max(maxSum, curSum);
        }

        // if all the array elements are negative

        int maxSum1 = 0;
        if (maxSum < 0) {
            for (int i = 0; i < arr.length; i++) {
                maxSum1 = Math.max(maxSum1, arr[i]);

            }
            return maxSum1;
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, -5, 6, -7, 10, 11 };

        int maxSum = kadane_algo(arr);
        System.out.println("Maximum SubArray Sum is : " + maxSum);
    }
}
