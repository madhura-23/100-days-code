public class day13 {
    public class ReverseWithStringBuilder {
    public static void main(String[] args) {
        String original = "HEYYYY HIO!";
        
        // Create a StringBuilder object from the original string
        StringBuilder sb = new StringBuilder(original);
        
        // Reverse the string
        sb.reverse();
        
        // Print the reversed string
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + sb.toString());
    }
}

}
