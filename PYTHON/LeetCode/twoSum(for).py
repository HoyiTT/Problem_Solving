'''
https://leetcode.com/problems/two-sum/
'''

class Solution:
    def twoSum(self, nums, target):
        n = len(nums)
        for a in range(n):
            for b in range(a + 1 , n):
                if nums[a] + nums[b] == target:
                    return [a ,b]
                

