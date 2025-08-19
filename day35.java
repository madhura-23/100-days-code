import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class day35 {
    class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer >map =new HashMap<>();
        Set<Integer>set =new HashSet<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);

        }

        for(int num: map.values()){
            set.add(num);
        }
        return map.size() == set.size();
           }
}
}
