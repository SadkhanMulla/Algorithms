public class BinarySearch_Algorithm {

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 8, 10, 11 };
        int key = 8;

        int result = binarySearch(arr, key);
        System.out.println("Key found at index " + result);
    }
}