/** 169. Majority Element
 *  https://leetcode.com/problems/majority-element/
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
class majorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];

        Map<Integer, Integer> numFreq = new HashMap<>();

        for (int num : nums) {
            if (numFreq.containsKey(num)) {
                numFreq.put(num, numFreq.get(num) + 1);
            }
            else {
                numFreq.put(num,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
