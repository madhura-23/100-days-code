class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:

        curr_len = 0          # characters only
        curr_items = []
        res = []

        for word in words:

            if curr_items and curr_len + len(curr_items) + len(word) > maxWidth:
                res.append(self.createStr(curr_items, maxWidth, curr_len))

                curr_items = [word]
                curr_len = len(word)
            else:
                curr_items.append(word)
                curr_len += len(word)

        # last line
        last = " ".join(curr_items)
        last += " " * (maxWidth - len(last))
        res.append(last)

        return res

    def createStr(self, words, maxWidth, chars_len):

        if len(words) == 1:
            return words[0] + " " * (maxWidth - chars_len)

        total_spaces = maxWidth - chars_len
        gaps = len(words) - 1

        even = total_spaces // gaps
        extra = total_spaces % gaps

        res = ""

        for i in range(gaps):
            res += words[i]
            res += " " * even

            if extra:
                res += " "
                extra -= 1

        res += words[-1]
        return res
