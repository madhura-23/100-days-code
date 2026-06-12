class Solution:
    def reverseWords(self, s: str) -> str:
        s = list(s)
        s.reverse()
        i, k, n = 0, 0, len(s)

        while i < n:
            # Find the starting pos of the next word
            while i < n and s[i] == " ": i += 1

            if i != n and k > 0: # Still have the next word, add " " here
                s[k] = " "
                k += 1

            start_index = k
            # Find the ending pos of that word
            while i < n and s[i] != " ":
                s[k] = s[i]
                i += 1
                k += 1
                
            # Reverse that word
            self.reverse(s, start_index, k-1)
            
        s = s[:k]
        return "".join(s)
    
    def reverse(self, s, l, r):
        while l < r:
            s[l], s[r] = s[r], s[l]
            l += 1
            r -= 1
