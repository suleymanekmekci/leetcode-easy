/** 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numbersAndIndices = new HashMap<>();
        int[] output = new int[2];
        for (int i = 0; i< nums.length; i++) {
            if (numbersAndIndices.containsKey(target - nums[i])) {
                output[0] = numbersAndIndices.get(target - nums[i]);
                output[1] = i;
                return output;
            }
            // 2 target - array[i]
            if (!(numbersAndIndices.containsKey(nums[i]))) {
                numbersAndIndices.put(nums[i],i);
            }
            // depends on what result wants, add else block and update the index of the number

        }
        return output;


    }
}
