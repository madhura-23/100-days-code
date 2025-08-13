public class day29 {
    public int maxVowels(String s, int k) {
        int maxVowelsCount = 0;
        int currentVowels = 0;
        
        for(int i=0; i<k; i++) {
            if(isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowelsCount = currentVowels;

        for(int i=k; i<s.length(); i++) {
            if(isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            if(isVowel(s.charAt(i))) {
                currentVowels++;
            }
            maxVowelsCount = Math.max(maxVowelsCount, currentVowels);
        }
        return maxVowelsCount;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}
