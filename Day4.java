public class Day4 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 7, 89, 1, 23};

        int max = arr[0];
        int min = arr[0];

        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max
            }
            if (arr[i] < min) {
                min = arr[i]; // update min
            }
        }

        System.out.println("Maximum value in array: " + max);
        System.out.println("Minimum value in array: " + min);
    }
}
