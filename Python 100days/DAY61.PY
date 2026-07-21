class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        l = len(words[0])
        d1 = {}
        
        for i in words:
            if i in d1:
                d1[i] += 1
            else:
                d1[i] = 1
        ans = []
        for start in range(l):
            i = start
            j = start
            d = d1.copy()
            while j <= len(s)-l:
                if s[j:j+l] in d and d[s[j:j+l]] > 0:
                    d[s[j:j+l]] -= 1
                    j+=l
                else:
                    if j-i == len(words)*l:
                        ans.append(i)
                    while i<j and s[i:i+l] != s[j:j+l]:
                        if s[i:i+l] in d:
                            d[s[i:i+l]] += 1
                        i+=l
                    if i!=j:
                        if s[i:i+l] in d:
                            d[s[i:i+l]] += 1
                        i+=l
                    else:
                        j+=l
                        i = j
            if j-i == len(words)*l:
                ans.append(i)
        return ans
