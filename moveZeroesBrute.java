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
class moveZeroesBrute {
    public void moveZeroes(int[] nums) {
        if (Arrays.binarySearch(nums,0) < 0) return;

        int low = 0;

        while (low < nums.length-1) {
            int high = low+1;
            while (high < nums.length) {
                if (nums[low] == 0 && nums[high] != 0) {
                    swapValues(low,high,nums);
                    low++;
                    high = low+1;
                    continue;
                }
                high++;
            }
            low++;
        }

    }

    public void swapValues(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
