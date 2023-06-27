'''
https://leetcode.com/problems/two-sum/
'''

class Solution:
    def twoSum(self, nums, target):
        orNums = nums
        nums.sort()
        l ,r = 0 , len(nums) - 1
        while l < r:
            if nums[l] + nums[r] > target: r -= 1
            elif nums[l] + nums[r] < target: l += 1
            elif nums[l] + nums[r] == target: break

        a , b = 0, 0

        for i in len(nums):
            if nums[l] == orNums[i]:
                a = i
        
        for i in len(nums):
            if nums[r] == orNums[i]:
                b = i

        return[a ,b]