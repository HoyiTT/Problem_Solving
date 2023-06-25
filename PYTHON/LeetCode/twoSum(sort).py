'''
https://leetcode.com/problems/two-sum/
'''

class Solution:
    def twoSum(self, nums, target):
        nums.sort()
        l ,r = 0 , len(nums) - 1
        while l < r:
            if nums[l] + nums[r] > target: r -= 1
            elif nums[l] + nums[r] < target: l += 1
            elif nums[l] + nums[r] == target: return nums[l] ,nums[r]

