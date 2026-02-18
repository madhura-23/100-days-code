class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        n = len(nums)
        if n <= 2:
            return n
        
        write = 2  # position to write next valid element
        for read in range(2, n):
            if nums[read] != nums[write-2]:
                nums[write] = nums[read]
                write += 1
                
        return write