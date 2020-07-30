/** 283. Move Zeroes
 *  https://leetcode.com/problems/move-zeroes/
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
class moveZeroesSnowball {
    public void moveZeroes(int[] nums) {
        if (Arrays.binarySearch(nums,0) < 0) return;
        int zeroCounter = 0;
        for (int i = 0; i< nums.length; i++) {

            if (nums[i] == 0) {
                zeroCounter++;
            }
            else {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeroCounter] = temp;
            }
        }
    }
}
