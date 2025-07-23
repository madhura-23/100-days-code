 import java.util.Arrays;
public class day10 {

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle k > n

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rightRotate(arr, k);
        System.out.println(Arrays.toString(arr)); // Output: [4, 5, 1, 2, 3]
    }
}


