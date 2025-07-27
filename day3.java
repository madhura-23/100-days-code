import java.util.ArrayList;

public class day3 {  
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");
        names.add("Madhura");

        // Replace "Charlie" with "Madhura"
        names.set(2, "Madhura");

        // Print the updated ArrayList
        System.out.println("Updated list: " + names);
    }
}
