class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        n = len(numbers)
        left, rght =  0, n - 1

        for _ in range(n):

            sm = numbers[left] + numbers[rght]

            if sm == target:
                return [left + 1,rght + 1]

            if sm < target: left+=1
            else: rght-=1
