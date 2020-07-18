/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,2]
 * Output: 12
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value,
 * that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
 */
class maxProduct {
    public int maxProduct(int[] nums) {

        int max = 0;
        int[] indices = new int[2];

        for (int i = 0; i< nums.length - 1;i++) {
            for (int j = i+1; j< nums.length; j++ ) {
                if (nums[i] + nums[j] > max) {
                    max = nums[i] + nums[j];

                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return (nums[indices[0]] - 1) * (nums[indices[1]] - 1);

    }
}
