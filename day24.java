import java.util.Arrays;

public class day24 {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] x = s.toCharArray();
            char[] y = t.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

            return Arrays.equals(x, y);
        } else {
            return false;
        }
    }
}

