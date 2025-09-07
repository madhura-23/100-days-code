import java.util.ArrayList;

public class Main {  
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");

        // Replace "Charlie" with "Chris"
        names.set(2, "Chris");

        // Print the updated ArrayList
        System.out.println("Updated list: " + names);
    }
}
