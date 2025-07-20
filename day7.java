public class day7 {
    public static void reverse (int[]arr){
        int start=0 , end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 8, 9};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        reverse(arr);
        
        System.out.println("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
