/* 643. Maximum Average Subarray I
https://leetcode.com/problems/maximum-average-subarray-i/
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 

Note:

1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].
*/
class findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
    

        int index = 0;
        int firstNumber = nums[index];
        
        double lastTotal = 0;

        for (int i = 0; i < k; i++) {
            lastTotal += nums[i];
        }
        
        double maxTotal = lastTotal;

        for (int j = k; j < nums.length ; j++) {
            lastTotal = lastTotal - firstNumber + nums[j];
            firstNumber = nums[++index];
            maxTotal = Math.max(lastTotal,maxTotal);
        }
        
        return maxTotal / Double.valueOf(k);
        
    }
}
