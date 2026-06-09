class Solution:
    sym_dict = {1000:'M', 900:'CM',
                500:'D', 400: 'CD',
                100:'C', 90:'XC',
                50:'L', 40:'XL',
                10:'X', 9:'IX',
                5:'V', 4:'IV',
                1:'I'}

    def intToRoman(self, num: int) -> str:
        result = []

        for val in self.sym_dict.keys():
            while num >= val:
                result.append(self.sym_dict[val]*(num//val))
                num %= val
        
        return ''.join(result)
        
